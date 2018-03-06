package com.adam.factoryPattern.abstractFactoryPattern.controller.wp;

import com.adam.factoryPattern.abstractFactoryPattern.controller.OperationController;

/**
 * @author adam
 * 创建于 2018-03-06 14:44.
 * WP系统操作控制器。
 */
public class WPOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("WPOperationController.control()");
    }
}
