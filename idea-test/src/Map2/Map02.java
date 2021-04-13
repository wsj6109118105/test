package Map2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Map02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for (int i=0;i<line.length();i++){
            char key = line.charAt(i);
            Integer value = hm.get(key);
            if (value==null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character s : keySet){
            Integer integer = hm.get(s);
            sb.append(s).append("(").append(integer).append(")");
        }
        System.out.println(sb);
    }
}
