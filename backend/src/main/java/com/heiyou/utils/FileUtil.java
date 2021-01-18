package com.heiyou.utils;

import java.io.File;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2021/1/18 17:12
 */
public class FileUtil {
    /**
     * 删除文件夹
     * @param dir
     */
    public static void deleteDir(File dir){
        for (File file : dir.listFiles()) {
            file.delete();
        }
        dir.delete();
    }

    /**
     * 如果文件夹不存在那就创建文件夹
     * @param dir
     */
    public static void createDir(File dir){
        if (!dir.isDirectory()){
            dir.mkdirs();
        }
    }
}
