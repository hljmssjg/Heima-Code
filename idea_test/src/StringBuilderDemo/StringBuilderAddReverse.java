package StringBuilderDemo;

public class StringBuilderAddReverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb.append("hello");

        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        System.out.println(sb == sb2); //说明sb2和sb是指的一个对象，sb2没有必要存在。

        // 一般用法
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hello ");
        sb3.append("world");
        System.out.println(sb3);

        // 链式编程
        StringBuilder sb4 = new StringBuilder();
        sb4.append("hello ").append("world");
        System.out.println(sb4);

        // 反转
        sb4.reverse();
        System.out.println("reversed sb4 " + sb4);


    }
}
