package 获取哈希值;

import 存储学生对象并遍历.Student;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", "12");

        // 同一个对象多次调用哈希值，返回的数值相同。
        System.out.println(s1.hashCode()); //2129789493
        System.out.println(s1.hashCode()); //2129789493

        Student s2 = new Student("林青霞", "12");
        // 默认情况下不同对象的哈希值是不相同的。如果在Student类中重写hashcode方法，可以实现不同对象的哈希值相同。
        System.out.println(s2.hashCode()); //668386784

        System.out.println("hello".hashCode()); //99162322
        System.out.println("world".hashCode()); //113318802
        System.out.println("world".hashCode()); //113318802

        System.out.println("重地".hashCode()); // 1179395
        System.out.println("通话".hashCode()); // 1179395
        // 为什么重地和通话哈希码相同？因为哈希值是有范围的，汉字是无限的。没办法超出编制了，只能发重复哈希码
        System.out.println("我的".hashCode());
    }


}
