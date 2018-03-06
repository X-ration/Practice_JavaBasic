package com.adam.factoryPattern.abstractFactoryPattern.factory;

import com.adam.factoryPattern.abstractFactoryPattern.controller.OperationController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.UIController;

/**
 * @author adam
 * 创建于 2018-03-06 14:48.
 */
public interface SystemAdaptorFactory {
    OperationController getOperationController();
    UIController getUIController();
}
