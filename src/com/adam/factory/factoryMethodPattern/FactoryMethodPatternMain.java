package com.adam.factory.factoryMethodPattern;

import com.adam.factory.factoryMethodPattern.factory.GifImageLoaderFactory;
import com.adam.factory.factoryMethodPattern.factory.JpgImageLoaderFactory;
import com.adam.factory.factoryMethodPattern.factory.PngImageLoaderFactory;
import com.adam.factory.factoryMethodPattern.loader.ImageLoader;

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
