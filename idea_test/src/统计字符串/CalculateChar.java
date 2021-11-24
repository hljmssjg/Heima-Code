package 统计字符串;

import java.util.Scanner;

public class CalculateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串！");
        String input = sc.nextLine();
        int countCapital = 0;
        int countLetter = 0;
        int countNum = 0;
        int countNone = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                countCapital++;
            } else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                countLetter++;
            } else if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                countNum++;
            } else{
                countNone++;
            }
        }
        System.out.println("大写字母的个数是"+countCapital+",小写字母的个数是"+countLetter+",数字的个数是"+countNum+",无法识别的字符个数是"+countNone);
    }
}
