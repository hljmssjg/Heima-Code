package 学生;

public class Student {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
