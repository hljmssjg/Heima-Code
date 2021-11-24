package 成绩排序;

public class Student implements Comparable<Student> {
    // 成员变量

    private String name;
    private int ChineseScore;
    private int MathScore;

    public Student(String name, int chineseScore, int mathScore) {
        this.name = name;
        ChineseScore = chineseScore;
        MathScore = mathScore;
    }

    public Student() {
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    @Override
    public int compareTo(Student s) {

        int STotal = s.ChineseScore + s.MathScore;
        int ThisTotal = this.ChineseScore + this.MathScore;
        int num = STotal - ThisTotal;
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }

    @Override
    public String toString() {
        return "姓名" + getName() + ", 语文成绩为" + getChineseScore() + ", 数学成绩为" + getMathScore() + ", 总分为" + (getChineseScore() + getMathScore());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}