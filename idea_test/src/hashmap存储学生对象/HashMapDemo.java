package hashmap存储学生对象;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student("孙健耕", 24);
        Student s2 = new Student("李安然", 23);
        Student s3 = new Student("李维瀚", 22);
        Student s4 = new Student("施霁桐", 21);

        Map<String, Student> studentMap = new HashMap<String, Student>();
        studentMap.put("2016160061", s1);
        studentMap.put("2016160062", s2);
        studentMap.put("2016160063", s3);
        studentMap.put("2016160064", s4);


        Set<String> s = studentMap.keySet();
        for (String num : s) {
            Student person = studentMap.get(num);
            System.out.println(num + "," + person);
        }
        System.out.println("---------------------------");

        Set<Map.Entry<String, Student>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Student> ME : entrySet) {
            String key = ME.getKey();
            Student student = ME.getValue();
            System.out.println(key + "," + student);
        }


    }
}
