package 线程;

public class Demo{
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();


        // run方法的调用并没有启用线程。还是单线程按顺序执行。
        // m1.run();
        // m2.run();

        m1.start();
        m2.start();
    }
}
