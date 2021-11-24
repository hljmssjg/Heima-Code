package 多态;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void security(){
        System.out.println("狗能看门");
    }
}
