package ArrayList存储Hashmap元素;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AHDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> al = new ArrayList<>();

        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("Map1中的一号", "孙健耕");
        map1.put("Map1中的二号", "李维瀚");
        map1.put("Map1中的三号", "李安然");
        map1.put("Map1中的四号", "施霁桐");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("Map2中的一号", "孙健耕");
        map2.put("Map2中的二号", "薛雨霏");
        map2.put("Map2中的三号", "高璎榕");
        map2.put("Map2中的四号", "张林");

        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("Map3中的一号", "孙健耕");
        map3.put("Map3中的二号", "陈天翔");
        map3.put("Map3中的三号", "陈展鸿");
        map3.put("Map3中的四号", "刘腾俊");

        HashMap<String, String> map4 = new HashMap<String, String>();
        map4.put("Map4中的一号", "孙健耕");
        map4.put("Map4中的二号", "文新源");
        map4.put("Map4中的三号", "黄祯");
        map4.put("Map4中的四号", "魏彬钰");

        al.add(map1);
        al.add(map2);
        al.add(map3);
        al.add(map4);


        for (HashMap<String, String> map : al) {
            Set<String> keyset = map.keySet();
            for (String key : keyset) {
                System.out.println(key + "," + map.get(key));

            }
        }


    }


}
