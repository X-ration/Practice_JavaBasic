package com.adam.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author adam
 * 创建于 2018-03-06 09:17.
 * Char Stream - Reader - InputStreamReader - FileReader
 *             - Writer - OutputStreamWriter - FileWriter
 */
public class FileReader_FileWriter {

    public static void main(String[] args) throws IOException {
        File file = new File("path/Hello1.txt");
        //file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        //fileWriter.write("HelloHello");
        fileWriter.append("append");
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader(file);

        char[] chars = new char[50];
        fileReader.read(chars);
        for(char c:chars) {
            System.out.print(c);
        }
        System.out.println((byte)chars[6]);
        fileReader.close();
    }

}
