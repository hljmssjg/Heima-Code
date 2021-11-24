package 字符流中的编码解码;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("idea_test\\java.txt"),
                StandardCharsets.UTF_8);
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("idea_test\\java.txt"),
                StandardCharsets.UTF_8);

        // 和字节流是一样的，一次读取一个或者一次读取一个字符数组
        char[] line = new char[1024];
        int len;
        while ((len = isr.read(line))!=-1){
            System.out.println(new String(line, 0, len));
        }
        isr.close();

    }
}
