package 老师与学生;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jiangeng", "23");
        System.out.println(teacher.getName() + "," + teacher.getAge());
        teacher.teach();

        Teacher teacher1 = new Teacher();
        teacher1.setAge("20");
        teacher1.setName("JJ");
        System.out.println(teacher1.getName() + "," + teacher1.getAge());
        teacher1.teach();
    }
}
