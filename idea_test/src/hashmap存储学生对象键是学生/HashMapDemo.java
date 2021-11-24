package hashmap存储学生对象键是学生;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student("孙健耕", 24);
        Student s2 = new Student("李安然", 23);
        Student s3 = new Student("李维瀚", 22);
        Student s4 = new Student("施霁桐", 21);

        String address1 = "Mingshui";
        String address2 = "Fengjing";
        String address3 = "Fengjing";
        String address4 = "Yujing";

        Map<Student,String> studentAddressMap = new HashMap<Student,String>();
        studentAddressMap.put(s1,address1);
        studentAddressMap.put(s2,address2);
        studentAddressMap.put(s3,address3);
        studentAddressMap.put(s4,address4);

        Student s5 = new Student("李维瀚", 22);
        String address5 = "Ningbo";
        studentAddressMap.put(s5,address5);


        Set<Student> studentSet =  studentAddressMap.keySet();

        for(Student s : studentSet){
            System.out.println(s + "," + studentAddressMap.get(s));
        }






    }
}
