package Collection演示;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        // 添加元素（和ArrayList方法一样）
        c.add("hello");
        c.add("world");
        // 重写了toString方法
        System.out.println(c);
    }
}
