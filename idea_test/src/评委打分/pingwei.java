package 评委打分;

import java.util.Scanner;
import java.util.Arrays;

public class pingwei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[6];
        for(int i = 0; i < 6; i++){
            System.out.println("请输入第"+ (i + 1) +"个评委的打分！");
            array[i] = sc.nextInt();
        }

        System.out.println("去掉一个最高分" + array[gotMax(array)] );
        System.out.println("去掉一个最低分" + array[gotMin(array)] );
        int[] arrayNew = meanArrGenerate(array, gotMax(array), gotMin(array));
        System.out.println("最终的得分（平均分为）" + getMean(arrayNew) );


    }

    public static int[] meanArrGenerate(int[] array, int flag1, int flag2 ) {
        int[] array_temp = new int[array.length-2];
        int count = 0;
        for (int i = 0; i< array.length; i++){
            if (i != flag1 && i != flag2){
                array_temp[count] = array[i];
                count++;
            }
        }
        return array_temp;
    }


    public static int gotMax(int[] arr) {
        int[] arr_temp = new int[arr.length];
        int max_value = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_temp[i] = arr[i];
        }
        Arrays.sort(arr_temp);
        max_value = arr_temp[arr.length - 1];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == max_value) {
                return j;
            }
        }
        return -1;
    }

    public static int gotMin(int[] arr) {
        int[] arr_temp = new int[arr.length];
        int min_value = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_temp[i] = arr[i];
        }
        Arrays.sort(arr_temp);
        min_value = arr_temp[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == min_value) {
                return j;
            }
        }
        return -1;
    }

    public static int getMean(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int mean = sum/arr.length;
        return mean;
    }


}
