package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Url02 {
    public static void main(String[] args) throws IOException {
        URL my = new URL("https://www.163.com/");
        BufferedReader in = new BufferedReader(new InputStreamReader(my.openStream()));
        String inputline;
        while((inputline=in.readLine())!=null){
            System.out.println(inputline);
        }
        in.close();
    }
}
