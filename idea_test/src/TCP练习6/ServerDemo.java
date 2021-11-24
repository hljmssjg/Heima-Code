package TCP练习6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        while (true) {

            Socket accept = ss.accept();

            new Thread(new ServerThread(accept)).start();
        }
    }
}
