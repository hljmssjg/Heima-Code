package 减肥计划;
import java.util.Scanner;
public class ifversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        ifversion(day);
    }

    public static void ifversion(int day){
        if (day == 1){
            System.out.println("跑步");
        }else if(day == 2){
            System.out.println("游泳");
        }else if(day == 3){
            System.out.println("慢走");
        }else if(day == 4){
            System.out.println("动感单车");
        }else if(day == 5){
            System.out.println("拳击");
        }else if(day == 6){
            System.out.println("爬山");
        }else if(day == 7){
            System.out.println("好好吃一顿");
        }else{
            System.out.println("输入日期有误");
        }
    }
}
