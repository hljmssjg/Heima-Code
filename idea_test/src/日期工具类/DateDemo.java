package 日期工具类;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        String format = "yyyy年MM月dd日 HH:mm:ss";
        Date d = new Date();
        System.out.println(d);

        String result = DateUtils.dataToString(d, format);
        System.out.println(result);

        Date new_date = DateUtils.stringToDate(result,format);
        System.out.println(new_date);
    }
}
