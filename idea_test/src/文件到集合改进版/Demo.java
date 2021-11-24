package 文件到集合改进版;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> al = new ArrayList<>();
        String source = "idea_test\\java.txt";


        BufferedReader br = new BufferedReader(new FileReader(source));

        String line;
        while((line = br.readLine())!=null){
            String[] strArr = line.split(",");

            Student s = new Student();
            s.setName(strArr[0]);
            s.setAge(Integer.parseInt(strArr[1]));
            s.setId(strArr[2]);
            s.setAddress(strArr[3]);

            al.add(s);
        }

        br.close();

        for(Student student: al){
            System.out.println(student);
        }
    }
}
