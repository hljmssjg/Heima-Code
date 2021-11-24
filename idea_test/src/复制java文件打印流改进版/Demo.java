package 复制java文件打印流改进版;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "E:\\Javacode\\JavaSE Code\\rookie\\rookie.java";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\theshy.java";

        BufferedReader br = new BufferedReader(new FileReader(source));
        PrintWriter pw = new PrintWriter(new FileWriter(destination),true);

        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }

        br.close();
        pw.close();



    }
}
