package com.adam.factory.factoryMethodPattern.factory;

import com.adam.factory.factoryMethodPattern.loader.ImageLoader;

/**
 * @author adam
 * 创建于 2018-03-06 14:24.
 * 图片加载器工厂抽象接口。
 */
public interface ImageLoaderFactory {
    ImageLoader getImageLoader();
}
