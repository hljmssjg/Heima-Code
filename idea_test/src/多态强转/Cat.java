package 多态强转;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void play(){
        System.out.println("猫玩玩具");
    }
}
