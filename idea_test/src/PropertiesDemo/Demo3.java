package PropertiesDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        myStore();
        myload();
    }

    private static void myload() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("java.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }


    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("123","孙健耕");
        prop.setProperty("1234","孙健");

        FileWriter fw = new FileWriter("java.txt");
        prop.store(fw,null);
        fw.close();
    }
}
