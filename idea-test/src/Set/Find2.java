package Set;

import java.util.HashSet;
import java.util.Set;

public class Find2 {
    public static void main(String[] args) {
        Set<String> uniques=new HashSet<String>();
        Set<String> dups=new HashSet<String>();
        String[] abc={"i","o","s","t"};
        uniques.add("e");
        uniques.add("x");
        uniques.add("o");
        for (String a : abc){
            if(!uniques.add(a)){
                dups.add(a);
            }
        }
        System.out.println(uniques.removeAll(dups));
        System.out.println("重复的单词："+dups);
        System.out.println("不重复的单词："+uniques);
    }
}
