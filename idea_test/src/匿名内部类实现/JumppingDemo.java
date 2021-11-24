package 匿名内部类实现;

public class JumppingDemo {
    public static void main(String[] args) {
        // 之前学过的接口的构造方法
        JumpingOperator jo = new JumpingOperator();
        Jumpping c = new Cat();
        jo.operate(c);

        // 如果有很多个动物，就要创建很多个类，太麻烦了。这时可以使用匿名内部类
        // 匿名内部类本质是继承了该类或实现了该接口的一个子类匿名对象。

        JumpingOperator jo1 = new JumpingOperator();
        jo1.operate(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });

        jo1.operate( new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猪可以跳高了");
            }
        });
        // 匿名内部类的多次调用
        Jumpping n = new Jumpping() {
            @Override
            public void jump() {
                System.out.println("袋鼠可以多次跳高了");
            }
        };
        jo1.operate(n);
        jo1.operate(n);
        jo1.operate(n);


    }
}
