package com.adam.factoryPattern.simpleFactoryPattern;

/**
 * @author adam
 * 创建于 2018-03-06 14:07.
 * 三角形。
 */
public class TriangleShape implements Shape{
    @Override
    public void draw() {
        System.out.println("TrangleShape.draw()");
    }
}
