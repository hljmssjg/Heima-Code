package 线程;

public class SetGetDemo {
    MyThread m1 = new MyThread();
    MyThread m2 = new MyThread();


    public static void main(String[] args){
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.setName("线程1");
        m2.setName("线程2");
        MyThread m3 = new MyThread("线程3");

        Thread.currentThread().setName("主线程");

        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());
        System.out.println(m3.getPriority());

        m1.start();
        try {
            m1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m2.setDaemon(true);
        m3.setDaemon(true);

        m2.start();
        m3.start();


        for(int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+","+i);

        }
    }
}
