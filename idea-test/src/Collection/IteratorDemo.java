package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("java");
        c.add("hello");
        c.add("world");
        Iterator<String> it = c.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
