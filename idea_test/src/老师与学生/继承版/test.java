package 老师与学生.继承版;

public class test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge("20");
        t1.setName("Jiangeng");
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Student s1 = new Student("Jiangeng", "21");
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();
    }
}
