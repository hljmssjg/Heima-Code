package Collection集合存储学生对象;

import 存储学生对象并遍历.Student;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", "30");
        Student s2 = new Student("张曼玉", "14");
        Student s3 = new Student("王祖贤", "18");

        Collection<Student> c = new ArrayList<>();
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + s.getAge());
        }


    }
}
