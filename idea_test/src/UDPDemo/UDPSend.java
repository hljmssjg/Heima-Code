package UDPDemo;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "hello,udp!".getBytes(StandardCharsets.UTF_8);
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.0.104"),10086);
        ds.send(dp);

        ds.close();
    }
}
