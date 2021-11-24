package PredicateDemo;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        boolean b1 = checkString("helloworld",s-> s.length()>8,s->s.length()<15);
        System.out.println(b1);
    }
    private static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        return pre1.and(pre2).test(s);
    }
}
