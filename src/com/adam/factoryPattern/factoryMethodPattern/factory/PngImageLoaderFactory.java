package com.adam.factoryPattern.factoryMethodPattern.factory;

import com.adam.factoryPattern.factoryMethodPattern.loader.ImageLoader;
import com.adam.factoryPattern.factoryMethodPattern.loader.PngImageLoader;

/**
 * @author adam
 * 创建于 2018-03-06 14:25.
 * PNG格式图片加载器工厂。
 */
public class PngImageLoaderFactory implements ImageLoaderFactory{
    @Override
    public ImageLoader getImageLoader() {
        return new PngImageLoader();
    }
}
