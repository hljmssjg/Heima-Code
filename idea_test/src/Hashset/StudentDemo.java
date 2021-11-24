package Hashset;

import 存储学生对象并遍历.Student;

import java.util.HashSet;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", "张曼玉");
        Student s2 = new Student("黄祯", "23");
        Student s3 = new Student("我爱罗", "99");

        Student s4 = new Student("黄祯", "22");

        HashSet<Student> hs = new HashSet<>();

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}
