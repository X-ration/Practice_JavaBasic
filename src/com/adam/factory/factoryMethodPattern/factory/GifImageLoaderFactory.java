package com.adam.factory.factoryMethodPattern.factory;

import com.adam.factory.factoryMethodPattern.loader.GifImageLoader;
import com.adam.factory.factoryMethodPattern.loader.ImageLoader;

/**
 * @author adam
 * 创建于 2018-03-06 14:25.
 * GIF格式图片加载器工厂。
 */
public class GifImageLoaderFactory implements ImageLoaderFactory{
    @Override
    public ImageLoader getImageLoader() {
        return new GifImageLoader();
    }
}
