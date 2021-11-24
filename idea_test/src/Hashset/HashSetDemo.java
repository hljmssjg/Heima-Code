package Hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("林青霞");
        hs.add("风清扬");
        hs.add("王冰冰");
        hs.add("王冰冰");
        System.out.println(hs);

        for(String s : hs){
            System.out.println(s);
        }

    }
}
