package 自动装箱与拆箱;

public class Pack {
    public static void main(String[] args) {
        // 手动装箱
        Integer i = Integer.valueOf(100);

        // 自动装箱
        Integer i1 = 100;

        System.out.println("____________________________________________________________-");

        //i1.intValue()是拆箱，再加上int赋值给ii叫自动装箱
        i1 = i1.intValue()+200;

        //自动拆箱+自动装箱，返回的是boxingi1
        i1 += 200;

        // 报错，因为i2为null，null不可以拆箱，空指针错误。
        // Cannot invoke "java.lang.Integer.intValue()" because "i2" is null
        // 使用前最好做一个是否为null的判断。
        Integer i2 = null;
        i2 += 200;
    }
}
