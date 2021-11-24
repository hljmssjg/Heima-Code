package Arrays;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6};
        System.out.println("排序前"+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后"+ Arrays.toString(arr));
    }
}
