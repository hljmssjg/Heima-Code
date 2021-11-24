package 方法重载;

public class chongzai {
    public static void main(String[] args) {
    // 调用
        int result = sum(10,20,30);
        System.out.println(result);
    }
    // 需求1： 求两个int类型数据和
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    // 需求2： 求两个double类型数据和
    public static double sum(double num1, double num2){
        return num1 + num2;
    }
    // 需求3： 求三个int类型数据和
    public static int sum(int num1, int num2 , int num3 ){
        return num1 + num2 + num3;
    }
}
