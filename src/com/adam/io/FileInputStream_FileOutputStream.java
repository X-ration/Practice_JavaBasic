package com.adam.io;

import java.io.*;

/**
 * @author adam
 * 创建于 2018-03-06 09:45.
 * Byte Stream - InputStream  - FileInputStream
 *             - OutputStream - FileOutputStream
 * Char Stream - Reader - BufferedReader
 *                      - InputStreamReader
 *             - Writer - OutputStreamWriter
 */
public class FileInputStream_FileOutputStream {

    public static void main(String[] args) throws IOException {
        /*byte bytes[] = {'a','b','c','d'};
        OutputStream outputStream = new FileOutputStream("path/stream");
        outputStream.write(bytes);
        outputStream.close();*/
        FileOutputStream fileOutputStream = new FileOutputStream("path/stream");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
        outputStreamWriter.write("Hello");  //实际上写入到缓冲区，调用flush()/close()后写入到文件。 OutputStreamWriter.close(): Closes the stream, flushing it first.
        //fileOutputStream.close();  //此句可省略，否则报java.io.IOException: Stream Closed
        outputStreamWriter.close();  //必须要在这里close，否则可能不写入
        //FileOutputStream.close(): Closes this file output stream and releases any system resources associated with this stream. This file output stream may no longer be used for writing bytes.

        InputStream inputStream = new FileInputStream("path/stream");
        /*int size = inputStream.available();
        for(int i=0;i<size;i++){
            System.out.print((char)inputStream.read());
        }*/

        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        String s;
        while( (s=bufferedReader.readLine())!=null) {
            System.out.print(s);
        }
        inputStream.close();
        bufferedReader.close();*/

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int c;
        while( (c=inputStreamReader.read()) != -1){
            System.out.print((char)c);
        }
        inputStream.close();
        inputStreamReader.close();

    }

}
