package Lambda练习3;

public class AddDemo {
    public static void main(String[] args) {
        // 参数类型可以省略
        useAddable((x, y) -> x-y);
    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
