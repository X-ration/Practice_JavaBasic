package com.adam.singletonPattern;

/**
 * @author adam
 * 创建于 2018-03-06 20:29.
 * 单例模式主类。
 */
public class SinglePatternMain {

    public static void main(String[] args) {
        SingletonObject.getInstance();
        SingletonObject.getInstance();
        SingletonObject.getInstance();
    }

}
