package com.adam.factoryPattern.abstractFactoryPattern.controller.android;

import com.adam.factoryPattern.abstractFactoryPattern.controller.UIController;

/**
 * @author adam
 * 创建于 2018-03-06 14:43.
 * 安卓系统UI控制器。
 */
public class AndroidUIController implements UIController{
    @Override
    public void display() {
        System.out.println("AndroidUIController.display()");
    }
}
