package 字符缓冲流复制java文件;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "E:\\Javacode\\JavaSE Code\\rookie\\rookie.java";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\theshy.java";


        BufferedReader br = new BufferedReader(new FileReader(destination));
        BufferedWriter bw = new BufferedWriter(new FileWriter(source));

        String line;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }


        bw.close();
        br.close();
    }
}
