package FileInputStreamDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("idea_test\\FileOutputStreamDemo.txt");

        // 第一次读取一个数据
        int read = fis.read();
        System.out.println((char)read);

        // 第二次读取一个数据
        read = fis.read();
        System.out.println((char)read);

        System.out.println("-------------------");

        // 读取所有的数据，文件到达末尾，返回值为-1
/*        int by = fis.read();
        while (by != -1){
            System.out.println((char)by);
            by = fis.read();
        }*/

        // 优化上面的程序
        int by;
        while((by = fis.read())!=-1){
            System.out.println((char)by);
        }


        fis.close();
    }
}
