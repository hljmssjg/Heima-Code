package 数组遍历;

public class bianli {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        bianli(array);
    }
    public static void bianli(int[] arr){
        System.out.print("[");
        for(int i = 0 ; i < arr.length; i++ ){
            System.out.print(arr[i]);
            if (i != arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
