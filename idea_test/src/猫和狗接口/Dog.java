package 猫和狗接口;

public class Dog extends Animal implements Jumpping{
    public Dog(){}

    public Dog(String name, String age){
        super(name,age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void jump() {
        System.out.println("狗跳高");
    }
}
