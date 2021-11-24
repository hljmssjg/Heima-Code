package 猫和狗抽象类;

public class test {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setAge("11");
        a.setName("Kitty");
        a.eat();
        a.show();


        Animal b = new Dog("Dogge","19");
        b.eat();
        b.show();
    }
}
