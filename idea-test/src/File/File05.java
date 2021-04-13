package File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File05 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\fos.txt");
        FileWriter fw = new FileWriter("D:\\fos1.txt");
        int c = fr.read();
        while (c!=-1){
            fw.write(c);
            c = fr.read();
        }
        fw.write("Digital World");
        fw.write("你好阿");
        fr.close();
        fw.close();
    }
}
