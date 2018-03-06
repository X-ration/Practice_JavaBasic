package com.adam.factoryPattern.abstractFactoryPattern;

import com.adam.factoryPattern.abstractFactoryPattern.controller.OperationController;
import com.adam.factoryPattern.abstractFactoryPattern.controller.UIController;
import com.adam.factoryPattern.abstractFactoryPattern.factory.AndroidSystemAdaptorFactory;
import com.adam.factoryPattern.abstractFactoryPattern.factory.IOSSystemAdaptorFactory;
import com.adam.factoryPattern.abstractFactoryPattern.factory.SystemAdaptorFactory;
import com.adam.factoryPattern.abstractFactoryPattern.factory.WPSystemAdaptorFactory;

/**
 * @author adam
 * 创建于 2018-03-06 14:51.
 * 抽象工厂模式主类。
 */
public class AbstractFactoryPatternMain {

    public static void main(String[] args) {
        SystemAdaptorFactory androidSystemAdaptorFactory = new AndroidSystemAdaptorFactory();
        OperationController androidOperationController = androidSystemAdaptorFactory.getOperationController();
        UIController androidUIController = androidSystemAdaptorFactory.getUIController();
        androidOperationController.control();
        androidUIController.display();

        SystemAdaptorFactory iosSystemAdaptorFactory = new IOSSystemAdaptorFactory();
        OperationController iosOperationController = iosSystemAdaptorFactory.getOperationController();
        UIController iosUIController = iosSystemAdaptorFactory.getUIController();
        iosOperationController.control();
        iosUIController.display();

        SystemAdaptorFactory wpSystemAdaptorFactory = new WPSystemAdaptorFactory();
        OperationController wpOperationController = wpSystemAdaptorFactory.getOperationController();
        UIController wpUIController = wpSystemAdaptorFactory.getUIController();
        wpOperationController.control();
        wpUIController.display();
    }

}
