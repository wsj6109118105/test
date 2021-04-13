package URL;

import java.io.*;
import java.net.*;
public class getSocket{
    public static void main(String[] args) throws Exception{
        Socket server = new Socket("www.baidu.com",80);
        BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter out = new PrintWriter(server.getOutputStream());
        BufferedReader wt = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = wt.readLine();
            out.println(str);
            out.flush();
            if(str.equals("end")){
                break;
            }
            System.out.println(in.readLine());
        }
        in.close();
        out.close();
        wt.close();
        server.close();
    }
}