package 运动员与教练接口;

public abstract class Human {
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

    public Human(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Human(){}

    public abstract void eat();

    public void show(){
        System.out.println("姓名"+name+"年龄"+age);
    }
}
