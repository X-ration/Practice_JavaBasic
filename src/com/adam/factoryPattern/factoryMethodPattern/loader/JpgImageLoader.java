package com.adam.factoryPattern.factoryMethodPattern.loader;

/**
 * @author adam
 * 创建于 2018-03-06 14:21.
 * JPG格式的图片加载器。
 */
public class JpgImageLoader implements ImageLoader{
    @Override
    public void loadImage() {
        System.out.println("JpgImageLoader.loadImage()");
    }
}
