package Consumer接口;

import java.util.function.Consumer;

public class Demo2 {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30","张曼玉,35","王祖贤,33"};

        printInfo(strArray,str -> System.out.print("姓名："+str.split(",")[0]),str->
                System.out.println(",年龄"+Integer.parseInt(str.split(",")[1])));
    }
    private static void printInfo(String[] strArray, Consumer<String> con1,Consumer<String> con2){
        for(String str : strArray){
            con1.andThen(con2).accept(str);
        }
    }
}
