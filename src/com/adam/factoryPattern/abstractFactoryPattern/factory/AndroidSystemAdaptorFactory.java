package com.adam.factoryPattern.abstractFactoryPattern.factory;

import com.adam.factoryPattern.abstractFactoryPattern.controller.OperationController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.UIController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.android.AndroidOperationController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.android.AndroidUIController;

/**
 * @author adam
 * 创建于 2018-03-06 14:49.
 * 安卓系统适配工厂。
 */
public class AndroidSystemAdaptorFactory implements SystemAdaptorFactory{
    @Override
    public OperationController getOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public UIController getUIController() {
        return new AndroidUIController();
    }
}
