package TCPDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPSend {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.104",10086);

        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello,TCP!".getBytes(StandardCharsets.UTF_8));

        s.close();
    }
}
