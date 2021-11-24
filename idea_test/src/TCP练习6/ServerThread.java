package TCP练习6;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;
    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            // BufferedWriter bw = new BufferedWriter(new FileWriter("java.txt"));
            int count = 1;
            File file = new File("copy.txt");
            while(file.exists()){
                file = new File("copy"+count+".txt");
                count++;
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter serverWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            serverWriter.write("上传成功");
            serverWriter.newLine();
            serverWriter.flush();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
