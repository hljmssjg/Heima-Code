package TreeSet;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        NewStudent s1 = new NewStudent("Qingxia Lin","21");
        NewStudent s2 = new NewStudent("Qingyang Feng","18");
        NewStudent s3 = new NewStudent("Jiangeng Sun","19");
        NewStudent s4 = new NewStudent("Wong Zing", "19");



        TreeSet<NewStudent> ts = new TreeSet<NewStudent>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(NewStudent ns: ts){
            System.out.println(ns);
        }


    }
}
