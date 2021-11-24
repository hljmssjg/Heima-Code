package 猫与狗;

public class test {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.setAge("21");
        kitty.setName("Kitty Marcus");
        System.out.println(kitty.getAge()+","+kitty.getName());
        kitty.catchMouse();

        Dog lucas = new Dog("Lucas Andersson","20");
        System.out.println(lucas.getAge()+","+lucas.getName());
        lucas.security();

    }
}
