package 可变参数的使用;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello","world","java");

        //list.add("javaee"); //UnsupportedOperationException
        //list.remove("hello"); //UnsupportedOperationException
        list.set(0,"hi");
        System.out.println(list);




        List<String>list2 = List.of("hello","world","java","java");
        // list2.add("java"); // UnsupportedOperationException
        //list2.remove("hello"); //UnsupportedOperationException

        //list2.set(0,"hi");//UnsupportedOperationException

        // Set<String> set = Set.of("hello","world","java","world"); //IllegalArgumentException
        Set<String> set = Set.of("hello","world","java");

        // set.add("javaee"); //UnsupportedOperationException
        // set.remove("javaee"); //UnsupportedOperationException
        // set集合没有带索引的方法，没有set方法。
        



    }
}
