package List;

import java.util.HashSet;

public class hSet {
    public static void main(String[] args) {
        HashSet<String> sc = new HashSet<String>();
        sc.add("hello");
        sc.add("world");
        sc.add("java");
        for (String s : sc){
            System.out.println(s);
        }
    }
}
