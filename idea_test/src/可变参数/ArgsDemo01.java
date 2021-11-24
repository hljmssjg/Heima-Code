package 可变参数;

public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));

        System.out.println(sum(10));
        System.out.println(sum());

    }

    public static int sum(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }
}
