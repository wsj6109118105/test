package File;

import java.io.File;
import java.io.IOException;

public class File01 {
    public static void main(String[] args) {
        //创建文件
        File f1 = new File("D:\\学习\\java.txt");
        try {
            System.out.println(f1.createNewFile());     //如果文件不存在，就创建文件，返回true,如果文件存在，不创建，返回false
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--------");
        //创建目录
        File f2 = new File("D:\\学习\\JAVASE");
        System.out.println(f2.mkdir());
        System.out.println("-------");   //如果目录不存在，就创建目录，返回true,如果目录存在，不创建，返回false
        //创建多级目录
        File f3 = new File("D:\\学习\\WEB\\HTML");
        System.out.println(f3.mkdirs());
    }
}
