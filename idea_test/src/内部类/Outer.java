package 内部类;

public class Outer {
    private int num = 10;
    public class Inner{
        // 内部类访问外部类成员
        public void show(){
            System.out.println(num);
        }
    }


    public void method(){
        // 这样不行
        // show();

        Inner i = new Inner();
        i.show();
    }
}
