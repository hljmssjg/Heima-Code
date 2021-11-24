package 文件到集合;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "idea_test\\java.txt";

        ArrayList<String> al = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(source));

        String line;
        while((line = br.readLine())!=null){
            al.add(line);
        }
        System.out.println(al);

        br.close();
    }
}
