package 猫和狗抽象类;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
