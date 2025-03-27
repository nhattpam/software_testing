package com.nhattpam.utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            InputStream inputStream = ConfigReader.class.getClassLoader()
                    .getResourceAsStream("config/config.properties");
            if (inputStream == null) {
                throw new RuntimeException("Không tìm thấy file config.properties!");
            }
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Lỗi khi đọc file config.properties!");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
