package 猫和狗接口;

public abstract class Animal {
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

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    public abstract void eat();

    public void show() {
        System.out.println(name + "," + age);
    }
}
