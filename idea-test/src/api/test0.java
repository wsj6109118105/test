package api;

//使用键盘录入

import java.util.Scanner;

public class test0
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
