package HashMap嵌套ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapInArrayList {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        ArrayList<String> al2 = new ArrayList<>();
        ArrayList<String> al3 = new ArrayList<>();

        al1.add("al1.1");
        al1.add("al1.2");
        al1.add("al1.3");

        al2.add("al2.1");
        al2.add("al2.2");
        al2.add("al2.3");

        al3.add("al3.1");
        al3.add("al3.2");
        al3.add("al3.3");

        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        hm.put("第一个数组", al1);
        hm.put("第二个数组", al2);
        hm.put("第三个数组", al3);

        Set<String> hmKeySet = hm.keySet();

        for (String num : hmKeySet) {
            for(String index : hm.get(num) ){
                System.out.println(num + index);
            }
        }
    }
}
