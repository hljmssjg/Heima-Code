package 猫和狗接口;

public class test {
    public static void main(String[] args) {
        // 动物的只能调动物方法
        Animal a = new Cat("Kitty","23");
        a.show();
        a.eat();
        // 因为Cat类里面有接口类，所以要想实现只能强转。
        ((Cat)a).jump();

        // 接口的只能调接口方法
        Jumpping j = new Cat("Doppy","21");
        j.jump();

        // 一般用这个
        Cat c = new Cat("James","18");
        c.show();
        c.eat();
        c.jump();
    }

}
