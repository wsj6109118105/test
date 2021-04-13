package Map2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Map03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(90);
        list.add(20);
        list.add(80);
        list.add(70);
        list.add(100);
        Collections.sort(list);
        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
