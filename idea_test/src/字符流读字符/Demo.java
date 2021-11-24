package 字符流读字符;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("idea_test\\java.txt"));

/*        int ch;
        while ((ch = isr.read())!=-1){
            System.out.println((char)ch);
        }*/

        System.out.println("---------------");

        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars))!=-1){
            System.out.println(new String(chars, 0, len));
        }
        isr.close();




    }
}
