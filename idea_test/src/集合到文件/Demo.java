package 集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "idea_test\\java.txt";

        ArrayList<String> al = new ArrayList<>();
        al.add("theshy来全杀了");
        al.add("rookie尽力了");
        al.add("wink状态");

        BufferedWriter bw = new BufferedWriter(new FileWriter(source));

        for(String string:al){
            bw.write(string);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
