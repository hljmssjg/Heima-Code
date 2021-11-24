package 返回数组;

public class returnarr {
    public static void main(String[] args) {
        int[] array = returnarr();
        System.out.println("["+ array[0] + "," + array[1] + ","+ array[2] + "]");
    }
    public static int[] returnarr(){
        int[] arr = {1,23,3};
        return arr;
    }
}
