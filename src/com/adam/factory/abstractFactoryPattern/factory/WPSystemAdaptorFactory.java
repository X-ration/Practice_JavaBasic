package com.adam.factory.abstractFactoryPattern.factory;

import com.adam.factory.abstractFactoryPattern.controller.OperationController;
import com.adam.factory.abstractFactoryPattern.controller.UIController;
import com.adam.factory.abstractFactoryPattern.controller.wp.WPOperationController;
import com.adam.factory.abstractFactoryPattern.controller.wp.WPUIController;

/**
 * @author adam
 * 创建于 2018-03-06 14:49.
 * WP系统适配工厂。
 */
public class WPSystemAdaptorFactory implements SystemAdaptorFactory{
    @Override
    public OperationController getOperationController() {
        return new WPOperationController();
    }

    @Override
    public UIController getUIController() {
        return new WPUIController();
    }
}
