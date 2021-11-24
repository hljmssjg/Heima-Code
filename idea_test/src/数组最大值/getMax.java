package 数组最大值;

public class getMax {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 55, 8};
        int result = getMax(array);
        System.out.println(result);
    }
    public static int getMax(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
