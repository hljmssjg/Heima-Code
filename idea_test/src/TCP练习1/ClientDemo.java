package TCP练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.104", 10086);
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello TCP!".getBytes(StandardCharsets.UTF_8));

        InputStream inputStream = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端:" + data);

        s.close();

    }
}
