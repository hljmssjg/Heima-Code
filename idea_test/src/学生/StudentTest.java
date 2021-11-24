package 学生;

public class StudentTest {
    public static void main(String[] args) {
        Student x = new Student();
        x.setAge(23);
        x.setName("Jiangeng");
        x.getInfo();

        Student y = new Student("Jiangeng", 23);
        y.getInfo();


    }
}
