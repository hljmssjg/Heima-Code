package 字符缓冲流;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "E:\\Javacode\\JavaSE Code\\rookie\\rookie.txt";
        String destination = "E:\\Javacode\\JavaSE Code\\theshy\\theshy.txt";


        BufferedReader br = new BufferedReader(new FileReader(destination));
        BufferedWriter bw = new BufferedWriter(new FileWriter(source));

        bw.write("theshy来全杀了");
        bw.write("\n");
        bw.write("rookie尽力了");

        char[] chars = new char[1024];
        int len;
        while ((len = br.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        bw.close();
        br.close();
    }
}
