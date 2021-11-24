package TCP练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();

        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String data = new String(bys, 0, len);

        System.out.println("服务器：" + data);

        OutputStream os = accept.getOutputStream();
        os.write("数据已经收到".getBytes(StandardCharsets.UTF_8));

        ss.close();

    }
}
