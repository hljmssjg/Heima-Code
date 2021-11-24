package 遍历目录;

import java.io.File;

public class FolderCheck {
    public static void main(String[] args) {
        File f1 = new File("E:\\Javacode\\JavaSE Code\\idea_test");
        check(f1);


    }

    public static void check(File dir){
        File[] files = dir.listFiles();
        if(files!=null){
            for (File file: files){
                if(file.isFile()){
                    System.out.println(file.getAbsolutePath());
                }else if(file.isDirectory()){
                    check(file);
                }else{
                    System.out.println("发生错误");
                    break;
                }
            }
        }else {
            System.out.println("该文件夹不存在！");
        }


    }
}
