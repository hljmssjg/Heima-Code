package 文件夹的复制;

import java.io.*;

public class DuoJiDemo {
    public static void main(String[] args) throws IOException {
        // 创建数据源目录对象
        File srcFile = new File("E:\\Javacode\\JavaSE Code\\theshy");
        // 创建目的地对象
        File destFile = new File("idea_test");
        // 使用copyFolder方法
        copyFolder(srcFile,destFile);


    }
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        //如果是文件夹
        if(srcFile.isDirectory()){
            // 在目的地下查找同名目录，如果没有就创建个新的
            String srcFilename = srcFile.getName(); // “一个文件夹”
            File newFolder = new File(destFile,srcFilename); // “idea_test\\一个文件夹”
            if(!newFolder.exists()){
                newFolder.mkdir();
            }
            File[] fileList =  srcFile.listFiles();
            for(File file:fileList){
                copyFolder(file,newFolder); //递归，新的文件夹地址取代了destFile。
            }
        }else{
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read())!=-1){
            bos.write(bys,0,len);
        }

        bis.close();
        bos.close();
    }
}
