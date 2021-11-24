package 链表集合特有方法;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // 创建链表

        LinkedList<String> ll = new LinkedList<>();

        ll.add("林青霞");
        ll.add("张曼玉");
        ll.add("王祖贤");

        // 方法1
        ll.addFirst("开头");
        System.out.println("方法1"+ll);
        // 方法2
        ll.addLast("结尾");
        System.out.println("方法2"+ll);
        // 方法3
        System.out.println("方法3"+ll.getFirst());
        // 方法4
        System.out.println("方法4"+ll.getLast());
        // 方法5
        System.out.println("方法5"+ll.removeFirst());
        System.out.println(ll);
        // 方法6
        System.out.println("方法6"+ll.removeLast());
        System.out.println(ll);
    }
}
