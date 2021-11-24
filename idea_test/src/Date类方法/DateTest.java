package Date类方法;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d.getTime());
        System.out.println("距今过去了"+d.getTime()*1.0/1000/60/60/24/365+"年");


        Date s = new Date();
        System.out.println(s);

        long time = 1000*60*60;
        s.setTime(time);
        System.out.println(s);


        long timi = System.currentTimeMillis();
        Date x = new Date();
        x.setTime(timi);
        System.out.println(x);
    }
}
