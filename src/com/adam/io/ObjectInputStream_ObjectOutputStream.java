package com.adam.io;

import java.io.*;

/**
 * @author adam
 * 创建于 2018-03-06 10:22.
 * Byte Stream - InputStream  - ObjectInputStream
 *                            - FileInputStream
 *             - OutputStream - ObjectOutputStream
 *                            - FileOutputStream
 */
public class ObjectInputStream_ObjectOutputStream {

    public static void main(String[] args) throws Exception {
        String s = "Hello World";
        byte[] bytes = {'e','x','a','m','p','l','e'};

        FileOutputStream fileOutputStream = new FileOutputStream("path/objectstream");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s);
        objectOutputStream.writeObject(bytes);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("path/objectstream");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println((String)objectInputStream.readObject());
        byte[] reads = (byte[])objectInputStream.readObject();
        for(byte b:reads) {
            System.out.print((char)b);
        }
        objectInputStream.close();
        fileInputStream.close();
    }

}
