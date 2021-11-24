package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCanva {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    addInfo(list);
                    break;
                case "2":
                    remove(list);
                    break;
                case "3":
                    modify(list);
                    break;
                case "4":
                    show(list);
                    break;
                case "5":
                    System.out.println("退出成功！");
                    System.exit(0);
            }
        }

    }

    public static ArrayList<Student> addInfo(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String id;
        while(true){
            System.out.println("请输入要添加的学生的学号：");
            id = sc.nextLine();
            if (check(id,list)){
                System.out.println("该学号已被占用，请重新添加新的学号。");
            }else{
                break;
            }
        }



        System.out.println("请输入要添加的学生的名字：");
        String name = sc.nextLine();
        System.out.println("请输入要添加的学生的年龄：");
        String age = sc.nextLine();
        System.out.println("请输入要添加的学生的住址：");
        String address = sc.nextLine();

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        list.add(student);
        System.out.println("添加学生成功！");
        return list;
    }

    public static void show(ArrayList<Student> list) {
        if (list.size() > 0) {
            System.out.println("--------------------------------------------");
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t地址");
            for (int i = 0; i < list.size(); i++) {
                Student element = list.get(i);
                System.out.println(element.getId() + "\t" + element.getName() + "\t" + element.getAge() + "岁\t\t" + element.getAddress());

            }
            System.out.println("--------------------------------------------");
            System.out.println("查看学生成功！");
        } else {
            System.out.println("系统内无学生信息，请添加信息！");
        }

    }

    public static void remove(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("请输入想要删除的学生的学号！");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Student element = list.get(i);
            if (element.getId().equals(id)) {
                list.remove(i);
                System.out.println("删除学生成功！");
                flag = true;
                break;

            }
        }
        if (!flag) {
            System.out.println("该学号不存在！");
        }

    }

    public static void modify(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("请输入想要修改的学生的学号！");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Student element = list.get(i);
            if (element.getId().equals(id)) {
                System.out.println("请输入新的姓名！");
                String name = sc.nextLine();
                element.setName(name);
                System.out.println("请输入新的年龄！");
                String age = sc.nextLine();
                element.setAge(age);
                System.out.println("请输入新的地址！");
                String address = sc.nextLine();
                element.setAddress(address);

                list.remove(i);
                list.add(i, element);
                System.out.println("修改学生成功！");
                flag = true;
                break;

            }

        }
        if (!flag) {
            System.out.println("该学号不存在！");
        }

    }

    public static boolean check(String id, ArrayList<Student> list) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            Student element = list.get(i);
            if(element.getId().equals(id)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
