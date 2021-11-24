package 字符串拼接;


public class StringTogether {
    public String joint(int[] arr) {
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
