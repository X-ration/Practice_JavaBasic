package com.adam.io;

import java.io.File;

/**
 * @author adam
 * 创建于 2018-03-06 10:47.
 * 目录相关。
 */
public class DirectoryOperations {

    public static void main(String[] args) {
        String dirName = "path/testDir";
        File dir = new File(dirName);
        //创建目录
        //System.out.println(dir.mkdir()?"成功":"失败");

        //读取目录
//        if(dir.isDirectory()) {
//            System.out.println("Dir:" + dir.getName());
//            String entrys[] = dir.list();
//            for(String entry:entrys){
//                File file = new File(dir.getName() + "/" + entry);
//                if(file.isDirectory()) {
//                    System.out.println("Dir  -"+file.getName());
//                } else {
//                    System.out.println("File -"+file.getName());
//                }
//            }
//        }

        //删除目录
        File[] files = dir.listFiles();
        if(files != null) {
            for(File file:files) {
                String fileName = file.getName();
                if(file.isDirectory()) {
                    //对于目录，只能删除空目录。
                    System.out.println((file.delete()?"成功删除目录":"删除目录失败")+fileName);
                } else {
                    System.out.println((file.delete()?"成功删除文件":"删除文件失败")+fileName);
                }
            }
        }

    }

}
