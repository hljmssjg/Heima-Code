package 字符串的拼接升级版;

public class Joint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("输出的数组是" + joint(arr));
    }

    public static String joint(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(",");
            }

        }
        sb.append("]");
        String line = sb.toString();
        return line;
    }
}
