package 异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() throws ParseException {
        String format = "YYYY-MM-dd";
        String date = "2019-10-18";

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(date);
        System.out.println(d);

    }
}
