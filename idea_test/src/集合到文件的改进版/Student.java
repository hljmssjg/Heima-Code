package 集合到文件的改进版;

public class Student {
    private String name;
    private int age;
    private String id;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    public Student(){}

    public Student(String name, int age,String id, String address){
        this.age = age;
        this.name = name;
        this.address = address;
        this.id = id;
    };


}
