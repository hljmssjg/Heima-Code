package Integer创建对象;

public class GetInteger {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        // toString方法已经重写过了
        System.out.println(i1);

        Integer i2 = Integer.valueOf("10");
        // toString方法已经重写过了
        System.out.println(i2);



    }
}
