package System常用方法;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("开始");
        long start = System.currentTimeMillis();


        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }


//        System.exit(0);
        System.out.println("结束");
        long end = System.currentTimeMillis();

        System.out.println("共耗时" + (end - start) + "毫秒");
        System.exit(0);
    }
}
