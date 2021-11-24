package 字符打印流;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("idea_test\\java.txt");
        pw.println("hello");
        pw.flush();
        pw.println("world");
        pw.flush();
        pw.close();


        PrintWriter pw2 = new PrintWriter(new FileWriter("idea_test\\java.txt"),true);
        pw2.println("ni");
        pw2.println("hao");
        pw2.close();
    }
}
