package TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPAccept {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();

        byte[] bys = new byte[1024];

        int len = inputStream.read(bys);

        String data = new String(bys,0,len);
        System.out.println("数据是:"+data);
        accept.close();
        ss.close();


    }
}
