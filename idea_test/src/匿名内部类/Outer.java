package 匿名内部类;

public class Outer {
    private int num = 10;

    public void method(){
        /*new Inter(){
            @Override
            public void eat() {
                System.out.println("重写吃饭方法");
            }
        }.eat();*/


        Inter i = new Inter(){
            @Override
            public void eat() {
                System.out.println("重写吃饭方法");
            }
        };
        i.eat();
    }
}
