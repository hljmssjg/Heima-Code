package 复制文件的异常处理;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo {
    public static void main(String[] args) {

    }

    // 方法一： 直接抛出
    private static void method1() throws IOException {
        FileWriter fw = new FileWriter("java.txt");
        FileReader fr = new FileReader("idea_test\\java.txt");
        char[] chars = new char[1024];
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(chars, 0, len);
        }
    }

    // 方法二： 标准化处理
    private static void method2() {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("java.txt");
            fr = new FileReader("idea_test\\java.txt");
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw == null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr== null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    // 方法三： JDK7
    private static void method3() {
        try (FileWriter fw = new FileWriter("java.txt");
             FileReader fr = new FileReader("idea_test\\java.txt")){
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 方案四： JDK9
    private static void method4() throws IOException {
        FileWriter fw = new FileWriter("java.txt");
        FileReader fr = new FileReader("idea_test\\java.txt");
        try (fw;fr){
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read()) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
