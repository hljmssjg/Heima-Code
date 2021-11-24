package InetAddress使用;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress byName = InetAddress.getByName("LAPTOP-R6IFN0JE");
        InetAddress byName = InetAddress.getByName("192.168.0.104");


        String name = byName.getHostName();
        String ip = byName.getHostAddress();

        System.out.println("主机名："+name);
        System.out.println("ip地址："+ip);


    }
}
