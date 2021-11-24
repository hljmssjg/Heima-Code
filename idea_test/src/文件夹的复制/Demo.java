package 文件夹的复制;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建数据源目录对象
        File srcFolder = new File("E:\\Javacode\\JavaSE Code\\rookie");
        //获取数据源目录的名称
        String folderName = srcFolder.getName();

        // 创建目的地目录
        File destFolder = new File("idea_test",folderName);

        // 如果目的地目录不存在，就新建一个目录
        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        // 创建一个文件数组，读取数据源目录下所有文件
        File[] listFiles = srcFolder.listFiles();

        // 写文件
        for(File srcFile:listFiles){
            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder,srcFileName);
            copyFile(srcFile,destFile);
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
