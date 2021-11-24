package 不死神兔;

public class rabbit {
    public static void main(String[] args) {
        int rabbits = 1;
        int result = rabbit(rabbits);
        System.out.println("第二十天的兔子数量是" + result);
    }

    public static int rabbit(int num) {
        int[] arr = new int[20];
        arr[0] = num;
        arr[1] = num;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[19];
    }
}

