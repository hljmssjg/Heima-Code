package 类型通配符;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<?> l = new ArrayList<Object>();
        List<?> l2 = new ArrayList<Number>();
        List<?> l3 = new ArrayList<Integer>();


        // List<? extends Number> l4 = new ArrayList<Object>();
        List<? extends Number> l5 = new ArrayList<Number>();
        List<? extends Number> l6 = new ArrayList<Integer>();

        List<? super Number> l7 = new ArrayList<Object>();
        List<? super Number> l8 = new ArrayList<Number>();
        // List<? super Number> l9 = new ArrayList<Integer>();

        // l.add("2");

    }
}
