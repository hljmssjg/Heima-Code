package 老师与学生;

public class Student {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(){};

    public Student(String name, String age){
        this.age = age;
        this.name = name;
    };

    public void study(){
        System.out.println("好好学习");
    }
}
