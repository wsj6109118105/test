package File;

import java.io.*;

public class File07 {
    public static void main(String[] args) throws IOException {
//        int a;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\fos.txt"));
//        a=br.read();
//        bw.write(a);
//        System.out.println(a);
//        bw.close();
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        System.out.println(s);
        br.close();
    }
}
