package Canlendar类;

import java.util.Calendar;

public class CalendarMethod {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        // 十年后的五天前
        // add方法
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "," + month + "," + date);
        // set方法
        // 注意这里老师讲错了，set方法月份设置多少就是多少，不需要+1。
        c.set(2048,11,7);

        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH);
        int date1= c.get(Calendar.DATE);
        System.out.println(year1 + "," + month1 + "," + date1);


    }
}
