package com.adam.factory.simpleFactoryPattern;

/**
 * @author adam
 * 创建于 2018-03-06 14:07.
 * 正方形。
 */
public class SquareShape implements Shape{
    @Override
    public void draw() {
        System.out.println("SquareShape.draw()");
    }
}
