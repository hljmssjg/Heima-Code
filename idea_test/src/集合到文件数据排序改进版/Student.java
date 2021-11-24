package 集合到文件数据排序改进版;

public class Student {
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public Student(String name, int math, int chinese, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public Student() {
    }

    public int Sum(){
        int ChineseScore = getChinese();
        int MathScore = getMath();
        int EnglishScore = getEnglish();

        return ChineseScore+MathScore+EnglishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                '}';
    }
}
