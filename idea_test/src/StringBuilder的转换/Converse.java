package StringBuilder的转换;

public class Converse {
    public static void main(String[] args) {
        // StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        String s = sb.toString();
        System.out.println(s);

        // String 转换为 StringBuilder
        String s1 = "hello";
        StringBuilder sb1 = new StringBuilder(s1); //本质上也是一种StringBuilder的构造方式。
        System.out.println(sb1);




    }
}
