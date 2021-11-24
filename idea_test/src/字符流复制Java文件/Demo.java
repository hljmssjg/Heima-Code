package 字符流复制Java文件;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "E:\\Javacode\\JavaSE Code\\rookie\\rookie.java";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\theshy.java";

        InputStreamReader isr = new InputStreamReader(new FileInputStream(source));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destination));

        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars))!=-1){
            osw.write(chars,0,len);
        }
        isr.close();
        osw.close();

    }
}
