package 字符串的比较;

public class StringCompare {
    public static void main(String[] args) {
        char[] chr = {'a','b','c'};
        String s1 = new String(chr);
        String s2 = new String(chr);

        String s3 = "abc";
        String s4 = "abc";

        // 地址是否相等
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        System.out.println();

        // 内容是否相等
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
