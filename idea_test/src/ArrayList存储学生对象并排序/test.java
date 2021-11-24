package ArrayList存储学生对象并排序;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("孙健耕", 24);
        Student s2 = new Student("李安然", 23);
        Student s3 = new Student("李维瀚", 22);
        Student s4 = new Student("施霁桐", 21);


        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = s1.getAge()-s2.getAge();
                int num2 = num==0? s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });


        for (Student s:al){
            System.out.println(s);
        }
    }
}
