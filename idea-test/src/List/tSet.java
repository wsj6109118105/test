package List;

import java.util.TreeSet;

public class tSet {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("zhangSan",99);
        Student s2 = new Student("liSi",100);
        Student s3 = new Student("liuWu",97);
        Student s4 = new Student("zhaoLiu",95);
        Student s5 = new Student("xiao",95);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s : ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
