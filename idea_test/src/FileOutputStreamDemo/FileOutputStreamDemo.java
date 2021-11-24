package FileOutputStreamDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args)  {

        // 两种构造方法
        FileOutputStream fos = null;
        try {
            //fos = new FileOutputStream("Z:\\idea_test\\FileOutputStreamDemo.txt");
            fos = new FileOutputStream("idea_test\\FileOutputStreamDemo.txt");
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.write("\n".getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fos!= null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }



    }
}
