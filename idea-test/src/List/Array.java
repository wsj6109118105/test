package List;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("hello");
        s.add("world");
        s.add("java");
        //增强for循环
        for(String c :s){
            System.out.println(c);
        }
        //正常for循环
        for(int i = 0;i<s.size();i++){
            String c = s.get(i);
            System.out.println(c);
        }
        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
