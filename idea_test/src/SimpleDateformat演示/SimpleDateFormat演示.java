package SimpleDateformat演示;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat演示 {
    public static void main(String[] args) throws ParseException {
        // 格式化： 从Date到String
        // 无参构造
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);
        //输出：2021/11/3 下午8:33

        //带参构造
        Date f = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s1 = sdf1.format(f);
        System.out.println(s1);

        //解析： 从String到Date
        String s2 = "2042-10-20 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date x = sdf2.parse(s2);
        System.out.println(x);



    }
}
