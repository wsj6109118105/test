package Collection2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionTEST {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student("贾浩杰",33);
        Student s2 = new Student("任庆贺",33);
        c.add(s1);
        c.add(s2);
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
