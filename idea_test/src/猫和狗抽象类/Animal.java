package 猫和狗抽象类;

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

    public Animal() {
    }

    ;

    public Animal(String name, String age) {
        this.age = age;
        this.name = name;
    }

    ;

    public abstract void eat();

    public void show() {
        System.out.println(name + "," + age);
    }
}
