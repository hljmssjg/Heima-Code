package 存储学生对象并遍历;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> al = new ArrayList<Student>();
        int count = 1;
        System.out.println("请依次输入学生的姓名和年龄，按#结束！");
        while (true) {
            System.out.println("请输入第" + count + "个同学的姓名");
            String name = sc.nextLine();
            if (name.equals("#")) {
                System.out.println("正在遍历列表……");
                break;
            }
            System.out.println("请输入第" + count + "个同学的年龄");
            String age = sc.nextLine();
            if (age.equals("#")) {
                System.out.println("请补充年龄后再按#退出！");
                System.out.println("请输入第" + count + "个同学的年龄");
                age = sc.nextLine();
            }

            Student student = new Student();
            student.setAge(age);
            student.setName(name);
            al.add(student);
            count++;

        }
        bianli(al);


    }

    public static void bianli(ArrayList<Student> al) {
        for (int i = 0; i < al.size(); i++) {
            Student element = al.get(i);
            System.out.println(element);
            System.out.println("------------");
            System.out.println(element.getName() + "," + element.getAge());
            System.out.println();

        }
    }
}
