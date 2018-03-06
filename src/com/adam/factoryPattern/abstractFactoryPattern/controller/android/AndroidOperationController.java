package com.adam.factoryPattern.abstractFactoryPattern.controller.android;

import com.adam.factoryPattern.abstractFactoryPattern.controller.OperationController;

/**
 * @author adam
 * 创建于 2018-03-06 14:43.
 * 安卓系统操作控制器。
 */
public class AndroidOperationController implements OperationController{
    @Override
    public void control() {
        System.out.println("AndroidOperationController.control()");
    }
}
