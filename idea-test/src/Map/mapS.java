package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapS {
    public static void main(String[] args) {
        Map<String, Student> hm = new HashMap<String, Student>();
        Student s1 = new Student("贾浩杰", 22);
        Student s2 = new Student("贾多多", 23);
        Student s3 = new Student("贾立镇", 32);

        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);

        //1.通过键找值
        Set<String> key = hm.keySet();
        for (String k : key) {
            Student s = hm.get(k);
            System.out.println(k + "," + s.getName() + "," + s.getAge());
        }
        //2.通过键值对找
        Set<Map.Entry<String, Student>> s = hm.entrySet();
        for (Map.Entry<String, Student> me : s) {
            String key1 = me.getKey();
            Student value = me.getValue();
            System.out.println(key1 + "," + value.getName() + "," + value.getAge());
        }
    }
}
