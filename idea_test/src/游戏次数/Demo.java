package 游戏次数;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();

        FileReader fr = new FileReader("idea_test\\java.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        if(number>=3){
            System.out.println("请充值");
        }else{
            Game.start();
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("idea_test\\java.txt");
            prop.store(fw,null);
            fw.close();

        }

    }
    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("count","0");
        FileWriter fw = new FileWriter("idea_test\\java.txt");
        prop.store(fw,null);
        fw.close();
    }
}
