package List3;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getScore()-o1.getScore();
                int num1=num==0?o2.getName().compareTo(o1.getName()):num;
                return num1;
            }
        });
        Student s1=new Student("wang",18,710);
        Student s2=new Student("li",18,699);
        Student s3=new Student("zhao",18,707);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student s : ts){
            System.out.println(s.getName()+","+s.getAge()+","+s.getScore());
        }
    }
}
