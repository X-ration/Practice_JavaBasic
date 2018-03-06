package com.adam.factoryPattern.abstractFactoryPattern.factory;

import com.adam.factoryPattern.abstractFactoryPattern.controller.OperationController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.UIController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.ios.IOSOperationController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.ios.IOSUIController;

/**
 * @author adam
 * 创建于 2018-03-06 14:49.
 * IOS系统适配工厂。
 */
public class IOSSystemAdaptorFactory implements SystemAdaptorFactory{
    @Override
    public OperationController getOperationController() {
        return new IOSOperationController();
    }

    @Override
    public UIController getUIController() {
        return new IOSUIController();
    }
}
