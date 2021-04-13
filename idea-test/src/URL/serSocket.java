package URL;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5678);        //创建SerSocket实例
        System.out.println("服务器启动，等待连接");
        Socket accept = server.accept();           //阻塞等待连接
        System.out.println("客户端建立连接");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));    //获得socket字节输入流转换为缓冲字符流
        PrintWriter out = new PrintWriter(accept.getOutputStream());      //获得socket连接的打印输出流
        while(true){
            String str = bufferedReader.readLine();
            System.out.println(str);
            out.println("已接受");
            out.flush();
            if(str.equals("end")){
                break;
            }
        }
        bufferedReader.close();
        out.close();
        accept.close();
        server.close();
    }
}
