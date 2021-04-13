package URL;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Url01 {
    static void out(){
        try{
            Inet4Address address= (Inet4Address) Inet4Address.getLocalHost();
            System.out.println("本机主机名为："+address.getHostName());
            System.out.println("本机IP为："+address.getHostAddress());
        }catch (UnknownHostException e){
            System.out.println("找不到主机地址。");
        }
    }
    static void inp(){
        try {
            InetAddress address = InetAddress.getByName("www.baidu.com");
            System.out.println("百度："+address.getHostName());
            System.out.println("百度："+address.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        out();
        System.out.println();
        inp();
    }
}
