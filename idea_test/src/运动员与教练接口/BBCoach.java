package 运动员与教练接口;

public class BBCoach extends Coach{
    public BBCoach() {
    }

    public BBCoach(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }
}
