package com.adam.factory.simpleFactoryPattern;

/**
 * @author adam
 * 创建于 2018-03-06 14:09.
 * 创建形状的工厂类。
 */
public class ShapeFactory {

    public static Shape createShape(String type) {
        if(type.equalsIgnoreCase("circle")) {
            return new CircleShape();
        } else if (type.equalsIgnoreCase("square")) {
            return new SquareShape();
        } else if (type.equalsIgnoreCase("triangle")){
            return new TriangleShape();
        } else {
            return null;
        }
    }

}
