package com.example.spring_activemq.util;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Slf4j
public class SysConfigUtil {

    public   static String getValueByKey(String fileName,String key){
        String JarPath = SysConfigUtil.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        log.info("获取到class文件路径"+JarPath);
        //拼接配置文件路径
        String ConfigPath=JarPath+fileName;
        log.info("拼接之后的路径"+ConfigPath);
        InputStream inputStream=null;
        try {
             inputStream=new FileInputStream(ConfigPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties=new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("获取值:"+properties.getProperty(key));
        return  properties.getProperty(key);
    }
}
