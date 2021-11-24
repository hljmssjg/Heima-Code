package TreeSet;

import 存储学生对象并遍历.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<NewStudent> ts = new TreeSet<NewStudent>(new Comparator<NewStudent>() {
            @Override
            public int compare(NewStudent s1, NewStudent s2) {
                int s1Age = Integer.parseInt(s1.getAge());
                int s2Age = Integer.parseInt(s2.getAge());
                int num1 = s1Age - s2Age;
                int num2 = num1 == 0? s1.getName().compareTo(s2.getName()):num1;
                return num2;
            }
        });


        NewStudent s1 = new NewStudent("Qingxia Lin","21");
        NewStudent s2 = new NewStudent("Qingyang Feng","18");
        NewStudent s3 = new NewStudent("Jiangeng Sun","19");
        NewStudent s4 = new NewStudent("Wong Zing", "19");
        NewStudent s5 = new NewStudent("Wong Zing", "19");



        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(NewStudent ns: ts){
            System.out.println(ns);
        }
    }
}
