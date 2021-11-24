package PropertiesDemo;

import java.util.Properties;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.put("1","孙健耕");
        prop.put("2","王晓松");
        prop.put("3","林青霞");

        Set<Object> keyset = prop.keySet();
        for (Object key: keyset){
            Object value = prop.get(key);
            System.out.println(key +","+ value);
        }
    }
}
