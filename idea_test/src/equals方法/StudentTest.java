package equals方法;

public class StudentTest {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("Jiangeng Sun");

        Student s2 = new Student();
        s2.setAge(20);
        s2.setName("Jiangeng Sun");

        System.out.println(s1.equals(s2));
    }
}
