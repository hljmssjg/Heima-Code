package StringBuilderDemo;

public class StringBuilderDemo {


    public static void main(String[] args) {
        // 无参构造
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("length:"+sb.length());

        // 带参构造
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:"+sb2);
        System.out.println("length2:"+sb2.length());
    }
}
