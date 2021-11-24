package ArrayList的构造与添加;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        // 在末尾添加字符串
        array.add("hello!");

        array.add(0, "Sven");
        System.out.println(array);

        // 删除
/*        array.remove("Sven");
        System.out.println(array);*/
/*        array.remove(0);
        System.out.println(array);*/

        // 替换元素
/*        array.set(0,"Jiangeng");
        System.out.println(array);*/

        // 返回指定索引处元素
        System.out.println(array.get(0));

        // 返回元素个数
        System.out.println(array.size());


    }
}
