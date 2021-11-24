package UDP通信程序;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine())!=null){
            if("886".equals(line)){

                break;
            }
            byte[] bys = line.getBytes(StandardCharsets.UTF_8);
            DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.0.104"),10086);
            ds.send(dp);
        }
        ds.close();
    }
}