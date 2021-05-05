package com.pattern.structure.proxy.dynamic.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 自定义动态代理类-字节码重组
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/30 20:22
 */
public class Proxy {

    public static final String LN = "\r\n";

    public static Object newProxyInstance(ClassLoader classLoader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h) {
        try {
            // 1、动态生成源代码.java文件
            String src = generateSrc(interfaces);

            // 2、.java文件输出磁盘（编译前必须先存盘）
            String filePath = Proxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();

            // 3、把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            // 4、编译生成的.class文件加载到JVM中
            Class<?> proxyClass = classLoader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);

            // 5、返回字节码重组以后的新的代理对象（传入动态代理对象）
            return constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 动态生成代理类的源代码.java文件
     *
     * @param interfaces
     * @return
     */
    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.pattern.structure.proxy.dynamic.custom;" + LN);
        sb.append("import java.lang.reflect.Method;" + LN);
        sb.append("import com.pattern.structure.proxy.statical.IBuyHouse;" + LN);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + LN);
            // 动态代理对象成员
            sb.append("InvocationHandler h;" + LN);
            // 构造函数（传入动态代理对象）
            sb.append("public $Proxy0(InvocationHandler h) {" + LN);
                sb.append("this.h = h;" + LN);
            sb.append("}" + LN);

        // 调用
        for (Method m : interfaces[0].getMethods()) {
            sb.append("public final " + m.getReturnType().getName() + " " + m.getName() + "() {" + LN);
                sb.append("try {" + LN);
                    sb.append("Method m = " + interfaces[0].getTypeName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + LN);
                    sb.append("h.invoke(this, m, null);" + LN);
                sb.append("} catch (Throwable throwable) {" + LN);
                    sb.append("throwable.printStackTrace();" + LN);
                sb.append("}" + LN);
            sb.append("}" + LN);
        }
        sb.append("}");

        return sb.toString();
    }


}
