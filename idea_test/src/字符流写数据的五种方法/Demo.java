package 字符流写数据的五种方法;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("idea_test\\java.txt"));

        osw.write(97);
        osw.flush();

        char[] chs = {'a', 'b', 'c', 'd', '中'};
        osw.write(chs);
        osw.flush();

        osw.write(chs,1,3);
        osw.flush();

        osw.write("theshy来全杀了");
        osw.flush();

        String s = "Rookie尽力了";
        osw.write(s,1,3);
        osw.flush();

        osw.close();
    }
}
