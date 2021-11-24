package list集合;

import 存储学生对象并遍历.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        // 产生并发修改异常
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if(s.equals("world")){
                list.add("javaee");
                // 通过添加break也可以解决错误
            }

        }*/
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")) {
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
