package com.adam.proxyPattern.dynamicProxy;

import com.adam.proxyPattern.delayedLoading.DBQuery;
import com.adam.proxyPattern.delayedLoading.IDBQuery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author adam
 * 创建于 2018-03-07 09:49.
 * 动态代理中DBQuery的Handler。
 */
public class DBQueryHandler implements InvocationHandler{
    private DBQuery realDBQuery = null;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(realDBQuery == null) {
            realDBQuery = new DBQuery();
        }
        if(method.getName().equals("request")) {
            return realDBQuery.request();
        } else {
            return null;
        }
    }
    public static IDBQuery createProxy() {
        IDBQuery proxy = (IDBQuery) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),new Class[]{IDBQuery.class},new DBQueryHandler()
        );
        return proxy;
    }
}
