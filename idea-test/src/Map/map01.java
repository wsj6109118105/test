package Map;

import java.util.HashMap;
import java.util.Map;

public class map01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("001","zhang");//put方法将指定的值与该映射中的指定键相关联
        map.put("002","li");
        System.out.println(map);
    }
}
