package com.kuiyix.common.utils;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * properties文件处理类
 * Created by 许勇进 on 2015-11-26.
 */
public class PropertiesUtils {

    public static Properties propertiesLoad(String path) throws IOException {
        Properties properties = new Properties();
        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        properties.load(bufferedInputStream);
        return properties;
    }
}
