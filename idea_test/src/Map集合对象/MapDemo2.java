package Map集合对象;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("2016160061", "孙健耕");
        map.put("jisu0012", "Jiangeng Sun");


        Set<String> keyset = map.keySet();

        for (String key : keyset) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

        System.out.println("----------------------------------");

        Set<Map.Entry<String,String>> entrySet= map.entrySet();
        for(Map.Entry<String,String> es: entrySet){
            String key = es.getKey();
            String value = es.getValue();
            System.out.println(key+","+value);
        }



    }
}
