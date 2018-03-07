package com.adam.proxyPattern.dynamicProxy;

import com.adam.proxyPattern.delayedLoading.IDBQuery;

/**
 * @author adam
 * 创建于 2018-03-07 10:00.
 * 动态代理主类。
 */
public class DynamicProxyMain {

    public static void main(String[] args) {
        IDBQuery proxy = DBQueryHandler.createProxy();
        System.out.println("动态代理类实例创建完成");
        proxy.request();
        System.out.println("代理实例第一次请求");
        proxy.request();
        System.out.println("代理实例第二次请求");
    }

}
