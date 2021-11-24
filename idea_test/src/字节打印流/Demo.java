package 字节打印流;

import java.io.IOException;
import java.io.PrintStream;

public class Demo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("idea_test\\rookie\\java.txt");

        ps.write(97);

        ps.print(97);
        ps.println(98);
        ps.println(false);

        ps.close();
    }
}
