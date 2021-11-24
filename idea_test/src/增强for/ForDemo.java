package 增强for;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 9};
        // 对于arr数组里面的每一个int类型的个体i
        for (int i : arr) {
            // System.out.println(i);
        }
        // 对于arr2数组里面的每一个String类型的个体s
        String[] arr2 = {"hello", "world", "java"};
        for(String s : arr2){
            // System.out.println(s);
        }

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

/*        for(String s: list){
            System.out.println(s);
        }*/


        for(String s: list){
            if(s.equals("world")){
                list.add("javaee");

            }
        }
        System.out.println(list);
    }
}
