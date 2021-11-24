package 自定义异常;

import 老师与学生.继承版.Teacher;

import java.util.Scanner;

public class teecherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();

        checkScore t = new checkScore();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
