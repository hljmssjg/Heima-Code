package 二月天;

import java.util.Calendar;
import java.util.Scanner;

public class FebDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearNum = sc.nextInt();
        Calendar c = Calendar.getInstance();
        //注意这里month不能设置为3！因为month是从0开始计数！
        c.set(yearNum, 2, 1);
        c.add(Calendar.DATE, -1);

        int day = c.get(Calendar.DATE);

        System.out.println(yearNum + "年的二月,一共有" + day + "天");

    }
}
