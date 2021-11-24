package 数组内容相同;

public class Compare {
    public static void main(String[] args) {
        int[] arr_1 ={1,2,3,88};
        int[] arr_2 = {1,2,3,88};

        System.out.println(compare(arr_1,arr_2));
    }
    public static boolean compare(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        } else{
            for(int i=0; i<arr1.length;i++){
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
