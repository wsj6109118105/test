package List2;

import ArrayListTest.ArrayListTest2;

import java.util.Comparator;
import java.util.TreeSet;

public class tTest {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num1 = num==0?o1.getName().compareTo(o2.getName()):num;
                return num1;
            }
        });
        Student s1 = new Student("zhangSan",99);
        Student s2 = new Student("liSi",100);
        Student s3 = new Student("liuWu",97);
        Student s4=new Student("yixiao",29);
        Student s5=new Student("damahou",30);
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
