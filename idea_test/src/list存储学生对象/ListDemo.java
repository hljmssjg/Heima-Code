package list存储学生对象;

import 存储学生对象并遍历.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", "30");
        Student s2 = new Student("风清扬", "29");
        Student s3 = new Student("左冷禅", "28");

        List<Student> l = new ArrayList<Student>();
        l.add(s1);
        l.add(s2);
        l.add(s3);

        // 遍历可以用collection的迭代器，也可以用for循环和.get结合
        Iterator<Student> iterator = l.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------------");

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getName() + "," + l.get(i).getAge());
        }
    }
}
