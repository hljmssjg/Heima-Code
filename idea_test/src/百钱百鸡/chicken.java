package 百钱百鸡;

public class chicken {
    public static void main(String[] args) {
        chicken();
    }

    public static void chicken() {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                for (int z = 0; z <= 100; z++) {
                    if (z % 3 == 0) {
                        if (x + y + z == 100 && 5 * x + 3 * y + z / 3 == 100) {
                            System.out.print(x + ",");
                            System.out.print(y + ",");
                            System.out.print(z + ",");
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
