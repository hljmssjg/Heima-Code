package 猫与狗多态;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setAge("21");
        a.setName("加菲");
        a.show(); //先看cat，发现没有show，就去父类中继承了show。
        a.eat();

        System.out.println("----------------------------");

        Animal b = new Cat("加菲", "10");
        b.show();
        b.eat();
        Cat c = (Cat) b;
        c.play();

        System.out.println("----------------------------");

        Animal d = new Dog("加菲", "10");
        d.show();
        d.eat();


    }
}
