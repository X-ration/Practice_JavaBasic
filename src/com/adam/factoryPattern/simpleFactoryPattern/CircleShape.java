package com.adam.factoryPattern.simpleFactoryPattern;

/**
 * @author adam
 * 创建于 2018-03-06 14:07.
 * 圆形。
 */
public class CircleShape implements Shape{
    @Override
    public void draw() {
        System.out.println("CircleShape.draw()");
    }
}
