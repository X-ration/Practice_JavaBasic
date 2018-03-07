package com.adam.proxyPattern.delayedLoading;

/**
 * @author adam
 * 创建于 2018-03-07 09:36.
 */
public class DelayedLoadingMain {

    public static void main(String[] args) {
        IDBQuery proxy = new ProxyDBQuery();
        System.out.println("代理实例创建完毕");
        proxy.request();
        System.out.println("代理实例第一次查询结束");
        proxy.request();
        System.out.println("代理实例第二次查询结束");
    }

}
