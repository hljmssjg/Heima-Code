package 老师与学生.继承版;

public class Person {
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

    public Person(){};

    public Person(String name,String age){
        this.age = age;
        this.name = name;
    };



}
