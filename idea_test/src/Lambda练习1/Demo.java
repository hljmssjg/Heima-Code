package Lambda练习1;

public class Demo {
    public static void main(String[] args) {
        Eatable e = new EatableImpl();
        useEatable(e);
        useEatable(()->{
            System.out.println("吃饭");
        });
    }
    private static void useEatable(Eatable e){
        e.eat();
    }
}
