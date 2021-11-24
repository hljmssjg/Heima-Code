package StringBuilder反转;
import java.util.Scanner;
public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("反转后的字符串是:"+reverse(input));
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String backLine = sb.toString();
        return backLine;

    }

}
