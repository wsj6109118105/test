package ArrayListTest;

/*public ArrayList()          创建一个空的集合对象
public boolean add(E e)     将指定元素追加到此集合的末尾
public void add(int index,E element)     在此集合的指定位置插入指定的元素
public boolean remove(Object o)         删除指定的元素，返回删除是否成功
public E remove(int index)              删除指定索引处的元素，返回被删除的元素
public E set(int index,E element)       修改指定索引处的元素，返回被修改的元素
public E get(int index)                 返回指定索引处的元素
public int size()                       返回集合中的元素个数
*/

import java.util.ArrayList;

public class ArrayListTest1
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("world");
        a.add("java");
        a.add(1,"javascript");
        System.out.println(a);
        System.out.println(a.remove("javascript"));
        System.out.println(a);
        System.out.println(a.remove(2));
        System.out.println(a.set(0,"hi"));
        System.out.println(a.get(1));
        System.out.println(a.size());
        System.out.println(a);
    }

}
