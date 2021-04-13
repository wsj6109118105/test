package Map2;

import java.util.ArrayList;
import java.util.Collections;

public class Map05 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        //定义牌组
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for (String color:colors){
            for (String number:numbers){
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");
        Collections.shuffle(array);
        ArrayList<String> cjsh = new ArrayList<String>();
        ArrayList<String> tmz = new ArrayList<String>();
        ArrayList<String> hbl = new ArrayList<String>();
        ArrayList<String> dp = new ArrayList<String>();
        for(int i=0;i<array.size();i++){
            String s = array.get(i);
            if (i>=array.size()-3){
                dp.add(s);
            }else if (i%3==0){
                cjsh.add(s);
            }else if (i%3==1){
                tmz.add(s);
            }else if (i%3==2){
                hbl.add(s);
            }
        }
        look("成吉思汗",cjsh);
        look("铁木真",tmz);
        look("忽必烈",hbl);
        look("底牌",dp);
    }
    public static void look(String name , ArrayList<String> array){
        System.out.print(name +"的牌:");
        for (String poker : array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
