package 字节流复制视频;

import java.io.*;

public class CopyVideo {
    public static void main(String[] args) throws IOException {
        String source = "E:\\Javacode\\JavaSE Code\\rookie\\沙皇一推五.webm";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\沙皇一推五.webm";

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

        byte[] bys = new byte[1042];
        int len;
        while( (len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();

    }
}
