package 字节流读取字节数组数据;

import java.io.FileInputStream;
import java.io.IOException;

public class FileOutputStreamRead {

    public static void main(String[]args)throws IOException {

        FileInputStream fis = new FileInputStream("idea_test\\FileOutputStreamDemo.txt");

        // 一般给1024及其整数倍
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys))!=-1){
            System.out.println(new String(bys, 0, len));
        }
        fis.close();


    }


}
