package TCP练习6;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.104", 10086);

        BufferedReader br = new BufferedReader(new FileReader("idea_test\\java.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        BufferedReader clientReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = clientReader.readLine();
        System.out.println("来自服务器的消息："+data);

        clientReader.close();
        br.close();
        s.close();
    }
}
