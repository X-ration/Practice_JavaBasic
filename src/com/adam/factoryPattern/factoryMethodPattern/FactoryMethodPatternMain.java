package com.adam.factoryPattern.factoryMethodPattern;

import com.adam.factoryPattern.factoryMethodPattern.factory.GifImageLoaderFactory;
import com.adam.factoryPattern.factoryMethodPattern.factory.JpgImageLoaderFactory;
import com.adam.factoryPattern.factoryMethodPattern.factory.PngImageLoaderFactory;
import com.adam.factoryPattern.factoryMethodPattern.loader.ImageLoader;

/**
 * @author adam
 * 创建于 2018-03-06 14:29.
 * 工厂方法模式主类。
 */
public class FactoryMethodPatternMain {

    public static void main(String[] args) {
        ImageLoader jpgLoader = new JpgImageLoaderFactory().getImageLoader();
        jpgLoader.loadImage();
        ImageLoader pngLoader = new PngImageLoaderFactory().getImageLoader();
        pngLoader.loadImage();
        ImageLoader gifLoader = new GifImageLoaderFactory().getImageLoader();
        gifLoader.loadImage();
    }

}
