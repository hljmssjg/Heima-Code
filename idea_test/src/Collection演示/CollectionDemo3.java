package Collection演示;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        System.out.println(c.add("Hello")); //输出的是是否添加成功,调用add方法永远返回的都是true。
        c.add("World");
        c.add("java");

        Iterator<String> it = c.iterator();

/*        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        // 异常：System.out.println(it.next());
        while(it.hasNext()){
            String s =it.next();
            System.out.println(s);
        }


    }
}
