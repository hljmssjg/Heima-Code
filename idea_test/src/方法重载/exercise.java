package 方法重载;

public class exercise {
    public static void main(String[] args) {
        System.out.println(isSame((byte)10, (byte)20));
        System.out.println(isSame((short)10, (short)20));
        System.out.println(isSame(10, 20));
        System.out.println(isSame(10L, 20L));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("byte:");
        return a == b;
    }
    public static boolean isSame(short a, short b){
        System.out.println("boolean:");
        return a == b;
    }
    public static boolean isSame(int a, int b){
        System.out.println("int:");
        return a == b;
    }
    public static boolean isSame(long a, long b){
        System.out.println("long:");
        return a == b;
    }
}
