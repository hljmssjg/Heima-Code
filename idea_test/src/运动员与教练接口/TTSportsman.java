package 运动员与教练接口;

public class TTSportsman extends Sportsman implements English{
    public TTSportsman() {
    }

    public TTSportsman(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓球");

    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员学英语");
    }
}
