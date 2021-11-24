package 集合到文件数据排序改进版;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo{
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int s1Sum = s1.Sum();
                int s2Sum = s2.Sum();

                int sumFlag = s1Sum - s2Sum;

                int mathFlag = sumFlag == 0? s1.getMath()-s2.getMath() : sumFlag;
                int ChineseFlag = mathFlag == 0? s1.getChinese()-s2.getChinese():mathFlag;
                int EnglishFlag = ChineseFlag == 0? s1.getEnglish()-s2.getEnglish():ChineseFlag;
                return EnglishFlag == 0? s1.getName().compareTo(s2.getName()):EnglishFlag;

            }

        });

        ts.add(new Student("李维瀚",95,94,93));
        ts.add(new Student("孙健耕",91,94,93));
        ts.add(new Student("施霁桐",95,91,93));
        ts.add(new Student("李安然",92,94,93));

        BufferedWriter br = new BufferedWriter(new FileWriter("idea_test\\java.txt"));

        for(Student student: ts){
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append(",").append(student.getMath()).append(",")
                    .append(student.getChinese()).append(",").append(student.getEnglish());

            br.write(sb.toString());
            br.newLine();
            br.flush();
        }

    }


}
