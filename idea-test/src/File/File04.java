package File;

import java.io.*;

public class File04 {
    public static void main(String[] args) throws IOException {
        File fos = new File("idea-test\\fos02.txt");
        FileInputStream in = new FileInputStream("idea-test\\fos01.txt");
        FileOutputStream out = new FileOutputStream("idea-test\\fos02.txt");
        BufferedInputStream bufferin = new BufferedInputStream(in);
        BufferedOutputStream bufferout = new BufferedOutputStream(out);
        byte[] data=new byte[1];
        while (bufferin.read(data)!=-1){
            bufferout.write(data);
        }
        bufferout.flush();
        bufferin.close();
        bufferout.close();
    }
}
