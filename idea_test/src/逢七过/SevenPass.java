package 逢七过;

public class SevenPass {
    public static void main(String[] args) {
        SevenPass();
    }

    public static void SevenPass() {
        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i /10 %10 == 7 ){
                System.out.println(i);
            }
        }
    }
}
