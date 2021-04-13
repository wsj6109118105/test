package Set;

import java.util.HashSet;
import java.util.Set;

public class Find {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        /*for (String a : args) {
            *//*if (!s.add(a)) {
                System.out.println("重复的元素：" + a);
            }*//*
            *//*s.add(a);*//*
            System.out.println(a);
        }*/
        s.add(String.valueOf(args));
        System.out.println(s);
        /*System.out.println(args);*/
    }
}
