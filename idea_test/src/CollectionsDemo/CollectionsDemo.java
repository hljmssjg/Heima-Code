package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        Collections.shuffle(al);
        System.out.println(al);
    }
}
