package 带返回值的方法练习;

public class exercise {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(getMax(a, b));
    }

    public static int getMax(int Num1, int Num2) {
        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }
}
