package UDPDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPAccept {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        ds.receive(dp); //相当于缓冲区

        System.out.println("数据是:"+new String(dp.getData(),0,dp.getLength()));
        ds.close();
    }
}
