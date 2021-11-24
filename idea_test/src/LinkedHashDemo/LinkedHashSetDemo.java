package LinkedHashDemo;

import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");

        for(String s:lhs){
            System.out.println(s);
        }
        //输出:hello
            //  world
        //   java

        lhs.add("java");
        for(String s:lhs){
            System.out.println(s);
        }
    }
}
