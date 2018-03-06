package com.adam.factory.abstractFactoryPattern.controller.wp;

import com.adam.factory.abstractFactoryPattern.controller.UIController;

/**
 * @author adam
 * 创建于 2018-03-06 14:44.
 * WP系统UI控制器。
 */
public class WPUIController implements UIController{
    @Override
    public void display() {
        System.out.println("WPUIController.display()");
    }
}
