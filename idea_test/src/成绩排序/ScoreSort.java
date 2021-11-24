package 成绩排序;

import java.util.HashSet;
import java.util.TreeSet;

public class ScoreSort {
    public static void main(String[] args) {
        Student s1 = new Student("Jiangeng Sun", 112,150);
        Student s2 = new Student("Wong Zing", 150,130);
        Student s3 = new Student("Weihan Li", 150,150);
        Student s4 = new Student("Jitong Shi", 130,150);
        Student s5 = new Student("Jitong Shi", 130,150);
        Student s6 = new Student("Jitong Shi", 129,140);


        TreeSet<Student> treeSet = new TreeSet<>();
        // 如果重复添加同名数据，可以用hashSet过滤。
        // 过滤前
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);
        hashSet.add(s6);
        for(Student s: hashSet){
            System.out.println(s);
            treeSet.add(s);
        }
        System.out.println("-------------------");
        // 过滤后再用treeSet排序

        for(Student s: treeSet){
            System.out.println(s);
        }


    }
}
