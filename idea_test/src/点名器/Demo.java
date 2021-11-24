package 点名器;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Demo {
    public static void main(String[] args) throws IOException {
        String source = "idea_test\\java.txt";

        ArrayList<String> al = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(source));

        String line;
        while((line = br.readLine())!=null){
            al.add(line);
        }
        br.close();

        Random r = new Random();
        String name = al.get(r.nextInt(al.size()));
        System.out.println(name);

    }
}
