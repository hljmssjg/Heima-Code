package 对象反序列化流;

import 对象序列化流.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java.txt"));
        Object obj = ois.readObject();

        Student s = (Student) obj;

        s.getInfo();

        ois.close();
    }

}
