package 十个随机数;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TenRandom {
    public static void main(String[] args) {
        boolean flag = true;
        Set<Integer> set = new HashSet<Integer>();
        while (flag) {
            int num = (int) (Math.random() * 20 + 1);
            set.add(num);
            int size = set.size();
            if (size == 10) {
                flag = false;
            }

        }
        System.out.println(set);
    }
}
