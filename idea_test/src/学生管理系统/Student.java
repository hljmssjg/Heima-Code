package 学生管理系统;

public class Student {
    // 成员变量
    private String id;
    private String name;
    private String age;
    private String address;

    // 构造方法
    public Student(){

    }
    public Student(String id, String name, String age, String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 成员方法

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }



}
