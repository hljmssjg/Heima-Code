package PropertiesDemo;

import java.util.Properties;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("123","孙健耕");
        prop.setProperty("1234","孙健");

        System.out.println(prop.getProperty("123"));
        System.out.println(prop.getProperty("12343"));

        Set<String> names = prop.stringPropertyNames();
        for(String key: names){
            System.out.println(key+","+prop.getProperty(key));
        }
    }
}
