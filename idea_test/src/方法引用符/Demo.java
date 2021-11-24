package 方法引用符;

public class Demo {
    public static void main(String[] args) {
        usePrintable(System.out::println);
    }

    public static void usePrintable(Printable p){
        p.printInt(666);
    }

}
