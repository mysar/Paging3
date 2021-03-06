package cn.wasis.util;

import java.io.IOException;
import java.util.Properties;

/**
 * 读取etc下面的config.properties文件
 * @author Mr.Yan
 * 时间:2017-05-19上午8:20:20
 * 说明:TODO
 */
public class Config {

    private static Properties properties = new Properties();
    static {
        try {
            properties.load(Config.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            throw new RuntimeException("读取config.properties文件异常",e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    public static String get(String key,String defaultValue) {
        return properties.getProperty(key,defaultValue);
    }
}
