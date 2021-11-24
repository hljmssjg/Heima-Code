package supplier使用;

import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 5, 6};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();

    }
}
