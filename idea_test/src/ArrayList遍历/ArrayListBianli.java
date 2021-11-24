package ArrayList遍历;

import java.util.ArrayList;

public class ArrayListBianli {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("hello");
        al.add("world");
        al.add("nihao");
        bianli(al);
    }

    public static void bianli(ArrayList<String> line){
        for(int i = 0; i < line.size(); i++){
            String s = line.get(i);
            System.out.println(s);
        }
    }
}
