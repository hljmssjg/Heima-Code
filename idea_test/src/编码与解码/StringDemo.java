package 编码与解码;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        byte[] bys = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bys)); //[-28, -72, -83, -27, -101, -67]
        String line = new String(bys);
        System.out.println(line); //中国

        bys = s.getBytes("GBK");
        System.out.println(Arrays.toString(bys)); //[-42, -48, -71, -6]
        line = new String(bys); //使用的UTF-8解码，出现问题 �й�
        System.out.println(line);
        line = new String(bys,"GBK");// 中国
        System.out.println(line);


    }
}
