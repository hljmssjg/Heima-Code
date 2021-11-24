package 遍历字符串;

import java.util.Scanner;

public class bianlistring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串！");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
        }
    }
}
