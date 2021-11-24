package 递归;

public class JieCheng {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static int f(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * f(n - 1);
    }
}
