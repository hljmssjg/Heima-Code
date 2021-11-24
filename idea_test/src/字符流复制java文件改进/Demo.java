package 字符流复制java文件改进;
import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "E:\\Javacode\\JavaSE Code\\rookie\\rookie.java";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\theshy.java";

        FileReader fr = new FileReader(source);
        FileWriter fw = new FileWriter(destination);

        //用法和那个麻烦的一样，就是简洁了而已。
        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars))!=-1){
            fw.write(chars,0,len);
        }

        fr.close();
        fw.close();

    }
}
