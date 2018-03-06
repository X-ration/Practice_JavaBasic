package com.adam.factory.factoryMethodPattern.loader;

/**
 * @author adam
 * 创建于 2018-03-06 14:21.
 * PNG格式的图片加载器。
 */
public class PngImageLoader implements ImageLoader{
    @Override
    public void loadImage() {
        System.out.println("PngImageLoader.loadImage()");
    }
}
