package 多态强转;

public class test {
    public static void main(String[] args) {
        // 向上转型
        Animal a = new Cat();
        a.eat();
        // 不可以 a.play();  因为这是猫类特有。


        // 向下转型
        Cat c = (Cat)a;
        c.eat();
        c.play();

    }
}
