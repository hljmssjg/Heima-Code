package 数组与链表;

import 存储学生对象并遍历.Student;

public class Rewrite extends Student {

    public Rewrite() {
    }

    public Rewrite(String name, String age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "姓名是" + getName() + "年龄是"+ getAge();
    }
}
