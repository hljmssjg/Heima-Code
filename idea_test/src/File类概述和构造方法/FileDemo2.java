package File类概述和构造方法;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        // true 为创建成功，false为文件已经存在

        // 创建文件
        File f1 = new File("E:\\theshy\\java.txt");
        System.out.println(f1.createNewFile());

        // 创建文件夹
        File f2 = new File("E:\\theshy\\javaSE");
        System.out.println(f2.mkdir());

        // 创建多级目录
        File f3 = new File("E:\\theshy\\javaWEB\\HTML");
        System.out.println(f3.mkdirs());


    }
}
