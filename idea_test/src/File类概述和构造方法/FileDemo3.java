package File类概述和构造方法;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File f1 = new File("idea_test\\src\\File类概述和构造方法\\FileDemo.java");

        System.out.println(f1.isDirectory());
        System.out.println(f1.exists());
        System.out.println(f1.isFile());

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());

        File f2 = new File("E:\\theshy");
        String[] list = f2.list();
        System.out.println("--------------------------");
        for(String str: list){
            System.out.println(str);
        }
        System.out.println("--------------------------");
        File[] files = f2.listFiles();
        for(File file:files){
            System.out.println(file);
            System.out.println(file.getName());
        }
        System.out.println("--------------------------");
        // 只要文件
        for(File file:files){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}
