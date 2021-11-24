package 对象序列化流;

import java.io.Serializable;

public class Student implements Serializable {

    private int age;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        System.out.println("使用带参方法定义");
        this.name = name;
        this.age = age;
    }

    public Student() {
        System.out.println("使用无参方法定义");
    }

    public void getInfo() {
        System.out.println("学生名为" + name);
        System.out.println("学生年龄为" + age);
    }
}
