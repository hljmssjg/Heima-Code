package 运动员与教练接口;

public abstract class Sportsman extends Human {
    public Sportsman() {
    }

    public Sportsman(String name, String age) {
        super(name, age);
    }

    public abstract void study();
}
