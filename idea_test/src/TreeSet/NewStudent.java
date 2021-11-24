package TreeSet;

import 存储学生对象并遍历.Student;
// implements Comparable<NewStudent>
public class NewStudent extends Student {
    public NewStudent() {
    }

    public NewStudent(String name, String age) {
        super(name, age);
    }

    // public String name = getName();


/*
    @Override
    public int compareTo(NewStudent s) {
        int thisAge = Integer.parseInt(this.getAge());
        int Age = Integer.parseInt(s.getAge());  //比较的一个是s的，一个是this的。
        int num1 = thisAge-Age;
        int num2 = num1 == 0? this.getName().compareTo(s.getName()):num1;
        return num2;
    }
*/

    @Override
    public String toString() {
        return getName()+","+getAge();
    }
}
