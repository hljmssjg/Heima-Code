package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("林青霞");
        s.add("风清扬");
        s.add("李冰冰");
        s.add("李冰冰");

        //两种方式遍历，迭代器或者增强for
        for(String i: s){
            System.out.println(i); // 不保证输出的顺序,且不能包含重复元素
        }

    }
}
