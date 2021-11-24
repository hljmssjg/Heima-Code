package Lambda练习2;

public class FlyDemo {
    public static void main(String[] args) {
        // 如果只有一个形参，可以不加小括号。
        useFlyable(s ->{
            System.out.println(s);
        });

        useFlyable(System.out::println);
    }
    private static void useFlyable(Flyable f){
        f.fly("风和日丽");
    }

}
