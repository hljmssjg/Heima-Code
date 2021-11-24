package 老师与学生.继承版;

public class Student extends Person{
    public Student(String name,String age){
        super(name,age);
    }

    public void study(){
        System.out.println("学习");
    }
}
