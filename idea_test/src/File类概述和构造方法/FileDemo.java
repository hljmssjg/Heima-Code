package File类概述和构造方法;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f1 = new File("E/theshy/java.txt");
        System.out.println(f1);

        File f2 = new File("E/theshy","java.txt");
        System.out.println(f2);

        File f3 = new File("E/theshy");
        File f4 = new File(f3,"java.txt");
        System.out.println(f4);
    }
}
