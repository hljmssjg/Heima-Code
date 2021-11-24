package Runnable实现多线程;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i< 100; i++){
            //不能直接使用getname方法。
            System.out.println(Thread.currentThread().getName()+","+i);
        }
    }
}
