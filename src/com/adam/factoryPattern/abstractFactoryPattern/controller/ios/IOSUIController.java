package com.adam.factoryPattern.abstractFactoryPattern.controller.ios;

import com.adam.factoryPattern.abstractFactoryPattern.controller.UIController;

/**
 * @author adam
 * 创建于 2018-03-06 14:43.
 * IOS系统UI控制器。
 */
public class IOSUIController implements UIController{
    @Override
    public void display() {
        System.out.println("IOSUIController.display()");
    }
}
