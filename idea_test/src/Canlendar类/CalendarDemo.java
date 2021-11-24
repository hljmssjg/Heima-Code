package Canlendar类;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // 多态的形式得到对象
        System.out.println(c); // 注意Month是从0开始的

        //Calendar.YEAR表示Calendar的成员变量。
        // 这个成员变量用static修饰，可以直接调用。因为是多态，重写了所以值变化了。
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "," + month + "," + date);
    }
}
