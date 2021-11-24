package 猫与狗;

public class Dog extends Animal{
    public Dog() {
        super();
    }

    public Dog(String name, String age) {
        super(name, age);
    }

    public void security(){
        System.out.println("狗可以看门");
    }
}
