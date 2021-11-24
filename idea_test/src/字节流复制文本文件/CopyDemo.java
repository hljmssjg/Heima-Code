package 字节流复制文本文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        String source = "E:\\Javacode\\JavaSE Code\\rookie\\rookie.txt";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\theshy.txt";

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
