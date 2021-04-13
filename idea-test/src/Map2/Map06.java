package Map2;


import java.util.*;

/*
1.创建HashMap,键是编号，值是牌
2.创建ArrayList,来存储编号
3.将编号发给玩家使用TreeSet集合排序
4.看牌时用编号来进行访问对应值
 */
public class Map06 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //颜色，和点数
        String[] colors = {"♥", "♦", "♠", "♣"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2"};
        //各种颜色的牌
        /*ArrayList<String> poker = new ArrayList<String>();
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }*/
        //将牌存入HashMap中
        /*for (int i = 0; i < 52; i++) {
            hm.put(i, poker.get(i));
        }*/
        //存储编号
        ArrayList<Integer> num = new ArrayList<Integer>();
        int index = 0;
        //将牌存储进HashMap,将编号存储进Arraylist
        for (String number: numbers){
            for (String color:colors){
                hm.put(index,color+number);
                num.add(index);
                index++;
            }
        }
        hm.put(52, "小王");
        hm.put(53, "大王");
        num.add(52);
        num.add(53);
//        System.out.println(hm);

        /*Set<Integer> integers = hm.keySet();
        for (Integer i : integers) {
            num.add(i);
        }*/
//        System.out.println(num);
        //对Arraylist集合调用方法进行洗牌
        Collections.shuffle(num);
        TreeSet<Integer> cjsh = new TreeSet<Integer>();
        TreeSet<Integer> tmz = new TreeSet<Integer>();
        TreeSet<Integer> hbl = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();
        //使用编号进行发牌
        for (int i = 0; i < num.size(); i++) {
//            int bianhao = num.get(i);
            if (i >= num.size() - 3) {
                dp.add(num.get(i));
            } else if (i % 3 == 0) {
                cjsh.add(num.get(i));
            } else if (i % 3 == 1) {
                tmz.add(num.get(i));
            } else if (i % 3 == 2) {
                hbl.add(num.get(i));
            }
        }
        //调用看牌方法
        look("成吉思汗", cjsh, hm);
        look("铁木真", tmz, hm);
        look("忽必烈", hbl, hm);
        look("底牌", dp, hm);
    }

    public static void look(String name, TreeSet<Integer> treeSet, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌：");
        for (Integer i : treeSet) {
//            int key = i;
            String s = hm.get(i);
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
