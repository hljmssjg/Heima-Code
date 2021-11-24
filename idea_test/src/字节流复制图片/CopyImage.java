package 字节流复制图片;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
    public static void main(String[] args) throws IOException {

        String source = "E:\\Javacode\\JavaSE Code\\rookie\\rookie.jpg";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\rookie.jpg";


        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        byte[] bys = new byte[1024];
        int len;
        while((len = fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }

        fis.close();
        fos.close();
    }
}
