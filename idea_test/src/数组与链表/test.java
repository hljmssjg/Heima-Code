package 数组与链表;

import 存储学生对象并遍历.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        Rewrite s1 = new Rewrite("林青霞","20");
        Rewrite s2 = new Rewrite("张曼玉","19");
        Rewrite s3 = new Rewrite("郭子维","17");

        // 创建Arraylist

        ArrayList<Rewrite> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);
        System.out.println("----------------------");


        // 三种方法遍历
        // 迭代器

        Iterator<Rewrite> it = al.iterator();
        while(it.hasNext()){
            Rewrite s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------------");
        //普通for循环

        for(int i =0; i < al.size(); i++){
            Rewrite s = al.get(i);
            System.out.println(s);
        }
        System.out.println("----------------------");
        // 增强for循环
        for(Student s : al){
            System.out.println(s);
        }



    }
}
