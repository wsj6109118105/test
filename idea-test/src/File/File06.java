package File;

import java.io.*;

public class File06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Student.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Student1.txt"));
        String s = br.readLine();
        while (s != null) {
            bw.write(s);
            bw.newLine();
            s = br.readLine();
        }
        br.close();
        bw.close();
    }
}
