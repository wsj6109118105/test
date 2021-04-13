package URL;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Url04 {
    public static void main(String[] args) throws IOException {
        URL wy = new URL("https://www.163.com/");
        URLConnection wycon = wy.openConnection();
        BufferedWriter in = new BufferedWriter(new OutputStreamWriter(wycon.getOutputStream()));
        String inputline;

        in.close();
    }
}
