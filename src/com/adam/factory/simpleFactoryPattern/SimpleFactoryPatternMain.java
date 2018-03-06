package com.adam.factory.simpleFactoryPattern;

/**
 * @author adam
 * 创建于 2018-03-06 14:12.
 * 简单工厂模式主类。
 */
public class SimpleFactoryPatternMain {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();
        Shape square = ShapeFactory.createShape("square");
        square.draw();
        Shape triangle = ShapeFactory.createShape("triangle");
        triangle.draw();
    }

}
