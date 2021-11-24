package 字符串反转;
import java.util.Scanner;
public class ConvertTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringConvert test = new StringConvert();
        System.out.println(test.convert(input));
    }
}
