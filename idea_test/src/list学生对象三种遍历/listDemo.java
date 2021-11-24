package list学生对象三种遍历;

import 存储学生对象并遍历.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", "21");
        Student s2 = new Student("张曼玉", "19");

        List<Student> l = new ArrayList<Student>();

        l.add(s1);
        l.add(s2);

        // 迭代器
        Iterator<Student> it = l.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        // 普通for
        for (int i = 0; i < l.size(); i++) {
            Student s = l.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }

        // 增强for
        for (Student s : l){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

}
