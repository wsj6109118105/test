package Set;

import javafx.print.Collation;

import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        String[] word = {"hello","ok","nice","buttiful"};
        for (String a : word){
            list.add(a);
        }
//        Collections.shuffle(list,new Random());
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previousIndex());
            System.out.println(iterator.previous());

//            iterator.next();
        }
//        System.out.println(list);
    }
}
