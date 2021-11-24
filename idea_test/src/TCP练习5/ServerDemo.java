package TCP练习5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        Socket accept = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("java.txt"));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter serverWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        serverWriter.write("上传成功");
        serverWriter.newLine();
        serverWriter.flush();
        ss.close();
        bw.close();
        serverWriter.close();
    }

}
