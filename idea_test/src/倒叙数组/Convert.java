package 倒叙数组;

public class Convert {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50 ,888, 9999};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length - i - 1] = arr[i];
        }
        bianli(arr2);
    }

    public static void bianli(int[] arr) {
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
            if (j != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
