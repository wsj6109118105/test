package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File03 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流文件
        FileInputStream fis = new FileInputStream("idea-test\\fos01.txt");
        //读数据的方法
        //读入一个字节数据
        /*
        int r1 = fis.read();
        System.out.println(r1);
        System.out.println((char)r1);
        */
        int by;
        while ((by= fis.read())!=-1){
            System.out.print((char)by);
        }
        //释放资源
        fis.close();
    }
}
