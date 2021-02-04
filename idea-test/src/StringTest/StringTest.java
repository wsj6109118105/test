package StringTest;

public class StringTest
{
    public static void main(String[] args)
    {
        String s1 = new String();
        System.out.println("s1" + s1);

        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2" + s2);

        byte[] bys = {97,98,99};
        String s3 =new String(bys);
        System.out.println("s3" + s3);

//        字符串比较
        String s4 = "abc";
        String s5 = "abc";
        String s6 = "def";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equals(s6));
        System.out.println(s4 == s5);
    }
}
