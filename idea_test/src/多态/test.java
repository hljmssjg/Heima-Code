package 多态;

public class test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        Dog d = new Dog();
        d.eat();

        AnimalOperator ao = new AnimalOperator();
        ao.operate(c);
        ao.operate(d);

        // ao.security(d); 无法调用父类没有的，子类特有功能。

    }
}
