package com.adam.proxyPattern.delayedLoading;

/**
 * @author adam
 * 创建于 2018-03-07 09:34.
 */
public class ProxyDBQuery implements IDBQuery{
    private DBQuery realDBQuery = null;
    @Override
    public String request() {
        if(realDBQuery == null) {
            realDBQuery = new DBQuery();
        }
        return realDBQuery.request();
    }
}
