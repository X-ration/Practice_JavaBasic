package com.adam.singletonPattern;

/**
 * @author adam
 * 创建于 2018-03-06 20:29.
 * 按照单例模式设计的SingletonObject类。
 */
public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject(){
        System.out.println("Created SingletonObject instance.");
    }

    public static SingletonObject getInstance() {
        if(instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }

}
