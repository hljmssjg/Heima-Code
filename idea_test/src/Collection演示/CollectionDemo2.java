package Collection演示;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        System.out.println(c.add("Hello")); //输出的是是否添加成功,调用add方法永远返回的都是true。
        c.add("World");
        c.add("World");

        System.out.println(c);

        c.remove("World");
        c.remove("asdasd"); //返回的是false，没有这个字符串。
        System.out.println(c);  //一次只能去除一个。

        boolean flag = c.contains("Hello");
        System.out.println(flag);

        c.clear();
        System.out.println(c);

        System.out.println(c.isEmpty());


    }
}
