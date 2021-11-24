package File类概述和构造方法;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        // 在项目的某个包里创建文件
        File f1 = new File("idea_test\\src\\File类概述和构造方法\\java.txt");
        System.out.println(f1.createNewFile());

        // 在项目的某个包里删除文件
        System.out.println(f1.delete());

        // 在项目的某个包里创建目录
        File f2 = new File("idea_test\\src\\File类概述和构造方法\\java");
        System.out.println(f2.mkdir());

        // 在项目的某个包里删除包
        System.out.println(f2.delete());
        // 如果该目录下有内容，那不能直接删除目录。要先删文件。
    }
}
