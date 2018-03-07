package com.adam.proxyPattern.delayedLoading;

/**
 * @author adam
 * 创建于 2018-03-07 09:32.
 * 真实的数据库查询类。
 */
public class DBQuery implements IDBQuery{

    public DBQuery() {
        try {
            Thread.sleep(500);
            System.out.println("数据库连接初始化完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "result from DBQuery";
    }
}
