package 字符串中的数据排序;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArr = s.split(" ");

        int[] arr = new int[strArr.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(arr);

        // 如何将数组输出为字符串呢？可以自己写一个方法（类似于自己之前写的那个"["+遍历+"]"）
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        for (int j = 0; j < arr.length;j++ ){
            sb.append(arr[j]);
            if (j!=arr.length-1){
                sb.append(" ");
            }

        }
        sb.append("\"");
        String result = sb.toString();
        System.out.println(result);
    }


}
