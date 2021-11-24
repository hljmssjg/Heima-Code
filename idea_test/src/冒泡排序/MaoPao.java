package 冒泡排序;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {13, 15, 61, 16, 41, 1};
        System.out.println("排序前的数组为" + joint(arr));


        for (int j = 0; j < arr.length-1; j++ ){
            int tempValue;
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tempValue = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempValue;
                }
            }

        }


        System.out.println("排序后的数组为"+joint(arr));


    }


    public static String joint(int[] arr) {
        String temp = "[";
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            if (i != arr.length - 1) {
                temp += ",";
            } else {
                temp += "]";
            }
        }
        return temp;
    }


}
