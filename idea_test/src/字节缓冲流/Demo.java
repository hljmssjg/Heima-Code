package 字节缓冲流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Demo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("idea_test\\FileOutputStreamDemo.txt");
        // 直接封装了一个大小为8192字节的数组。
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
        bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));

        //fos.close();
        bos.close();


        FileInputStream fis = new FileInputStream("idea_test\\FileOutputStreamDemo.txt");
        // 直接封装了一个大小为8192字节的数组。
        BufferedInputStream bis = new BufferedInputStream(fis);
/*        int by;
        while((by = bis.read())!=-1){
            System.out.println((char)by);
        }*/
        //fis.close();
        //bis.close();

        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        //bis.close();

    }
}
