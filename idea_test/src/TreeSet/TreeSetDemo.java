package TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(10);
        ts.add(20);
        ts.add(50);
        ts.add(40);
        ts.add(30);
        ts.add(30);

        System.out.println(ts);
        for (Integer i : ts){
            System.out.println(i);
        }
    }
}
