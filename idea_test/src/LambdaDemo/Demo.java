package LambdaDemo;

public class Demo {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("启动");
        }).start();
    }
}
