package Date类构造;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date a = new Date();
        //按理来说应该输出地址值，但是并没有。说明重写了Object.toString方法。
        System.out.println(a);

        long date = 1000*60*60;
        Date b = new Date(date);
        System.out.println(b);
    }
}
