package com.adam.factory.factoryMethodPattern.factory;

import com.adam.factory.factoryMethodPattern.loader.ImageLoader;
import com.adam.factory.factoryMethodPattern.loader.JpgImageLoader;

/**
 * @author adam
 * 创建于 2018-03-06 14:25.
 * JPG格式加载器工厂。
 */
public class JpgImageLoaderFactory implements ImageLoaderFactory{
    @Override
    public ImageLoader getImageLoader() {
        return new JpgImageLoader();
    }
}
