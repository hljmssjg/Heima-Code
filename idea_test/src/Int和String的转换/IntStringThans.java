package Int和String的转换;

public class IntStringThans {
    public static void main(String[] args) {
        int a = 10;

        // 第一种方法
        String s = "" + a;
        System.out.println(s);

        // 第二种方法
        String s1 = String.valueOf(a);
        System.out.println(s1);

        System.out.println("---------------");

        String s2 = "100";
        // 方法一： String- Integer-Int
        Integer i = Integer.valueOf(s2);
        int x = i.intValue();
        System.out.println(x);

        //方法二： String-Int
        int y = Integer.parseInt(s2); //parse是解析的意思
        System.out.println(y);
    }

}
