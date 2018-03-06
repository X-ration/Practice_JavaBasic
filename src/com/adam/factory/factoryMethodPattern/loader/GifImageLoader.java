package com.adam.factory.factoryMethodPattern.loader;

/**
 * @author adam
 * 创建于 2018-03-06 14:21.
 * GIF格式的图片加载器。
 */
public class GifImageLoader implements ImageLoader {
    @Override
    public void loadImage() {
        System.out.println("GifImageLoader.loadImage()");
    }
}
