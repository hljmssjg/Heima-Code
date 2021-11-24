package 运动员与教练接口;

public class test {
    public static void main(String[] args) {
        BBSportsman bbs = new BBSportsman("James","21");
        bbs.show();
        bbs.eat();
        bbs.study();
        System.out.println("----------------------------");
        TTSportsman tts = new TTSportsman();
        tts.setAge("19");
        tts.setName("Long Ma");
        tts.show();
        tts.eat();
        tts.study();
        tts.speakEnglish();
        System.out.println("----------------------------");
        BBCoach bbc = new BBCoach("Popovich","80");
        bbc.show();
        bbc.eat();
        bbc.teach();
        System.out.println("----------------------------");
        TTCoach ttc = new TTCoach("Guoliang Liu","45");
        ttc.show();
        ttc.eat();
        ttc.teach();
        ttc.speakEnglish();
    }
}
