package com.adam.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author adam
 * 创建于 2018-03-06 09:32.
 * BufferedReader.
 */
public class ReadFromConsole {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a char");
        char c = (char)reader.read();
        System.out.println("Char:" + c);
        reader.readLine();   // 缓冲作用，否则输入字符时按下的回车会让下面的readLine()直接执行到程序结束

        System.out.println("Input a line");
        String s = reader.readLine();
        System.out.println("String:" + s);

        reader.close();
    }

}
