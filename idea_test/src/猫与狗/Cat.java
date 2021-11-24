package 猫与狗;

public class Cat extends Animal {
    public Cat(){
        super();
    }

    public Cat(String name, String age){
        super(name,age);
    }

    public void catchMouse(){
        System.out.println("猫可以抓老鼠");
    }
}
