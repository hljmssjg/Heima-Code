package 成员内部类;

public class InnerDemo {
    public static void main(String[] args) {
        // 这样写不行
        // Inner i = new Inner();

        // 当内部类为public，但是不常用
/*        Outer.Inner oi = new Outer().new Inner();
        oi.show();*/

        // 当内部类为private时，需要在外部类编写一个方法，创建对象，调用内部类的方法，然后再测试类调用外部类中的调用方法。
        Outer o = new Outer();
        o.method();
    }
}
