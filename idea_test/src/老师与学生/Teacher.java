package 老师与学生;

public class Teacher {
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

    public Teacher() {

    }

    public Teacher(String name, String age) {
        this.age = age;
        this.name = name;
    }

    public void teach(){
        System.out.println("上课");
    }

}
