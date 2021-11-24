package 运动员与教练接口;

public class BBSportsman extends Sportsman {
    public BBSportsman() {
    }

    public BBSportsman(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习打篮球");
    }
}
