package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Url03 {
    public static void main(String[] args) throws IOException {
        URL wy = new URL("https://www.163.com/");
        URLConnection wycon = wy.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(wycon.getInputStream()));
        String inputline;
        while((inputline = in.readLine())!=null){
            System.out.println(inputline);
        }
        in.close();
    }
}
