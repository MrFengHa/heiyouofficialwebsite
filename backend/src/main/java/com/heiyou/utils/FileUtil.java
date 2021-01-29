package com.heiyou.utils;

import org.springframework.web.multipart.MultipartFile;

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
     *
     * @param dir
     */
    public static void deleteDir(File dir) {
        if (dir == null) {
            throw new NullPointerException("传过来的文件夹是空字符串");
        }
        if (!dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                file.delete();
            }
            dir.delete();
        }
    }

    /**
     * 如果文件夹不存在那就创建文件夹
     *
     * @param dir
     */
    public static void createDir(File dir) {
        if (dir != null) {
            if (!dir.isDirectory()) {
                dir.mkdirs();
            }
        }

    }

    /**
     * 获取上传文件的后缀名
     * @param file
     * @return
     */
    public static String getSuffix(MultipartFile file) {
        if (file==null){
            throw  new NullPointerException("上传文件中没有文件");
        }
        return getSuffix(file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")));
    }
    /**
     * 传入File根据文件获取后缀名
     * @param file
     * @return
     */
    public static String getSuffix(File file) {
        if (file==null){
            throw  new NullPointerException("没有文件");
        }
        return getSuffix(file.getName().substring(file.getName().lastIndexOf(".")));
    }

    /**
     * 根据文件名称返回后缀名
     * @param file
     * @return
     */
    public static String getSuffix(String file) {
        if (file==null||file.length()==0){
            throw  new NullPointerException("字符串为空");
        }
        return file.substring(file.lastIndexOf("."));
    }
}
