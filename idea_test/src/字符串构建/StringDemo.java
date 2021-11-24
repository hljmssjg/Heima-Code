package 字符串构建;

public class StringDemo {
    public static void main(String[] args) {
        // 创建一个空白字符串内容
        String s1 = new String();
        System.out.println("s1:" + s1);

        //根据字符数字内容创建对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //根据字节数组内容创建对象
        // 97 98 99 是ASCII 码
        byte[] byts = {97, 98, 99};
        String s3 = new String(byts);
        System.out.println("s3:" + s3);

        //直接赋值
        String s4 = "abc";
        System.out.println("s4:" + s4);
    }


}
