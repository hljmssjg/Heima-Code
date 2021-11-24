package 带参数方法练习;

public class exercise {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        getMax(a, b);
    }

    public static void getMax(int Num1, int Num2) {
        if (Num1 > Num2) {
            System.out.println(Num1);
        } else {
            System.out.println(Num2);
        }
    }
}
