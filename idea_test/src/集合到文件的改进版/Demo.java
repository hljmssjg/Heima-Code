package 集合到文件的改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> al = new ArrayList<>();
        Student s1 = new Student("Jiangeng Sun",24,"2016160061","Heilongjiang");
        Student s2 = new Student("Jiansun Sun",23,"2016160062","Heilongjiang");

        al.add(s1);
        al.add(s2);

        String source = "idea_test\\java.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(source));

        for(Student student:al){
            bw.write(student.getName());
            bw.write(",");
            bw.write(String.valueOf (student.getAge()));
            bw.write(",");
            bw.write(student.getId());
            bw.write(",");
            bw.write(student.getAddress());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
