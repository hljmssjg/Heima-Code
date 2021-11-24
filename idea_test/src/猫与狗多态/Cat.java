package 猫与狗多态;

public class Cat extends Animal{
    public Cat(){}

    public Cat(String name, String age){
        super(name, age);
    }


    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void play(){
        System.out.println("猫玩玩具");
    }
}
