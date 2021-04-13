package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File02 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("idea-test\\fos01.txt",true);
        //写数据
        for (int i=0;i<=10;i++){
            fos.write("hello".getBytes());
            fos.write("\n".getBytes());
        }
        //释放资源
        fos.close();
    }
}
