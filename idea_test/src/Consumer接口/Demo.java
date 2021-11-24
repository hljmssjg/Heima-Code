package Consumer接口;

import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        operatorString("dasdsa", System.out::println,s-> System.out.println(new StringBuilder(s).reverse()));
    }
    private static void operatorString(String name, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(name);
    }
}
