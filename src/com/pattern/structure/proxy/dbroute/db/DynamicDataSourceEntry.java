package com.pattern.structure.proxy.dbroute.db;

/**
 * 动态切换数据源
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/16 21:01
 */
public class DynamicDataSourceEntry {

    /**
     * 默认数据源
     */
    public static final String DEFAULT_SOURCE = null;

    private static final ThreadLocal<String> LOCAL = new ThreadLocal<String>();

    public DynamicDataSourceEntry() {}

    /**
     * 清空数据源
     */
    public static void clear() {
        LOCAL.remove();
    }

    /**
     * 获取当前正在使用的数据源名字
     *
     * @return String
     */
    public static String get() {
        return LOCAL.get();
    }

    /**
     * 还原当前切面的数据源
     */
    public static void restore() {
        LOCAL.set(DEFAULT_SOURCE);
    }

    /**
     * 设置已知名字的数据源
     *
     * @param source 数据源
     */
    public static void set(String source) {
        LOCAL.set(source);
    }

    /**
     * 根据年份动态设置数据源
     * 如：DB_2019、DB_2020
     *
     * @param year 年份
     */
    public static void set(int year) {
        LOCAL.set("DB_" + year);
    }

}
