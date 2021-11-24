package predicate应用;


import java.util.function.Function;


public class Demo {
    public static void main(String[] args) {
        String s = "林青霞,33";
        convert(s,name->name.split(",")[1], Integer::parseInt,i->i+70);
    }
    private static void convert(String s, Function<String, String>fun1,Function<String, Integer>fun2,Function<Integer, Integer>fun3){
        int i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);
    }
}
