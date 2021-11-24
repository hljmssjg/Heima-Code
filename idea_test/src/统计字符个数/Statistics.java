package 统计字符个数;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashMap<String,Integer> hm = new HashMap<>();

        String[] strArr = input.split("");
        for (String s : strArr) {
            if(!hm.containsKey(s)){
                hm.put(s,1);
            }else{
                int newNum = hm.get(s)+1;
                hm.put(s,newNum);

            }
        }
        Set<String> strings = hm.keySet();
        for(String s : strings){
            System.out.print(s+"("+hm.get(s)+")");
        }


    }
}
