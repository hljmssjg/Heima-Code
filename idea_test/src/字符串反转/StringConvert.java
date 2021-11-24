package 字符串反转;

public class StringConvert {
    public String convert(String line) {
        String temp = "";
        for (int i = line.length()-1; i >= 0 ; i--){
            temp += line.charAt(i);
        }
        return temp;
    }
}
