package Runnable实现多线程;

public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"高铁");
        Thread t2 = new Thread(mr,"飞机");

        t1.start();
        t2.start();
    }
}
