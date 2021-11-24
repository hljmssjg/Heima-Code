package 运动员与教练接口;

public class TTCoach extends Coach implements English{
    public TTCoach() {
    }

    public TTCoach(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练需要学习英语");
    }
}
