package com.adam.factory.abstractFactoryPattern.controller.ios;

import com.adam.factory.abstractFactoryPattern.controller.OperationController;

/**
 * @author adam
 * 创建于 2018-03-06 14:43.
 * IOS系统操作控制器。
 */
public class IOSOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("IOSOperationController.control()");
    }
}
