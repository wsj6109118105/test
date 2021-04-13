package Map2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Map01 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("孙策","大桥");
        hm.put("刘备","孙尚香");
        hm.put("至尊宝","紫霞仙子");
        array.add(hm);
        HashMap<String,String> hm1 = new HashMap<String, String>();
        hm1.put("吕布","貂蝉");
        hm1.put("诸葛亮","黄月英");
        array.add(hm1);

        for (HashMap<String,String> me : array){
            Set<String> keySet = me.keySet();
            for(String mm : keySet){
                String s = me.get(mm);
                System.out.println(mm+","+s);
            }
        }
    }
}
