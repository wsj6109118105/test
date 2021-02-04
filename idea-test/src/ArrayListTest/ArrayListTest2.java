package ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest2
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("林动");
        a.add("萧炎");
        a.add("牧尘");
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
}
