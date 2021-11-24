package 最值;

public class zuizhi {
    public static void main(String[] args) {
    maxi();
    }
    public static void maxi(){
        int[] arr = {1, 2, 3, 0, 5, 6, 77, 8, 9};
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println("最大值为" + temp);
    }
}
