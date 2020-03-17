package com.pattern.behavior.delegate.mvc;

import com.pattern.behavior.delegate.mvc.controller.MemberController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 核心控制器-委派人
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/31 18:05
 */
public class DispatcherServlet {

    private List<Handler> handlerMapping = new ArrayList<>();

    {
        Class<MemberController> memberConClass = MemberController.class;
        try {
            handlerMapping.add(new Handler()
                    .setController(new MemberController())
                    .setMethod(memberConClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response) {
        doDispatch(request, response);
    }

    private void doDispatch(HttpServletRequest request, HttpServletResponse response) {
        // 1、获取用户请求的url
        // 按照J2EE的标准、每个url对应一个servlet，url由浏览器输入
        String uri = request.getRequestURI();

        // 2、根据url匹配handlerMapping(策略常量)
        Handler handler = null;
        for (Handler h : handlerMapping) {
            if (h.getUrl().equals(uri)) {
                handler = h;
                break;
            }
        }

        // 3、通过反射调用控制器对应的Method
        Object obj = null;
        try {
            obj = handler.getMethod().invoke(handler.getController(), request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // 4、获取Method的执行结果，通过Response返回
        try {
            response.getWriter().write(obj.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Handler {
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }

}
