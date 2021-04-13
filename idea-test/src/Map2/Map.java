package Map2;

import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<Student,String>();
        Student s1 = new Student("一般般",22);
        Student s2 = new Student("一点点",23);
        Student s3 = new Student("一丢丢",24);
        Student s4 = new Student("一丢丢",24);

        hm.put(s1,"一的班");
        hm.put(s2,"一的点");
        hm.put(s3,"一的丢");
        hm.put(s4,"二丢丢");

        Set<java.util.Map.Entry<Student, String>> entrySet = hm.entrySet();
        for (java.util.Map.Entry<Student, String> me : entrySet){
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
    }
}
