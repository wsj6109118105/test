package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;

public class File08 {

    Object a;
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("D:\\random.txt"));
        Random r = new Random();
        int a;
        for(int i=0;i<10;i++){
            a = r.nextInt(100);
            out.print(a+"\t");
            System.out.println(r);
        }
        out.close();
    }
}
