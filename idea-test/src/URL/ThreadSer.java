package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadSer extends Thread{
    private Socket client;
    public ThreadSer(Socket s){
        client = s;
    }
    public void run(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));    //获得socket字节输入流转换为缓冲字符流
            PrintWriter out = new PrintWriter(client.getOutputStream());      //获得socket连接的打印输出流
            while(true){
                String str = bufferedReader.readLine();
                System.out.println(str);
                out.println("已接受");
                out.flush();
                if(str.equals("end")){
                    break;
                }
            }
            client.close();
        }catch (IOException e){}
        finally { }
    }

    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(5678);
        while(true){
            Socket socket = server.accept();
            ThreadSer mu = new ThreadSer(socket);
            mu.start();
        }
    }
}
