package Map集合对象;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {


    //添加

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("2016160061","孙健耕");
        map.put("jisu0012","Jiangeng Sun");
        map.put("2016160060","孙健森"); //当键重复的时候，值会替代。

        System.out.println(map.remove("jisu0012")+"，删除后的map为"+map);
        System.out.println(map.remove("jisu")+"，删除后的map为"+map);

        map.clear();
        System.out.println(map);

        map.put("2016160061","孙健耕");
        map.put("jisu0012","Jiangeng Sun");
        System.out.println(map.containsKey("jisu0012"));
        System.out.println(map.containsKey("2016160000"));

        System.out.println(map.containsValue("孙健耕"));
        System.out.println(map.containsValue("孙健森"));

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());
    }


}
