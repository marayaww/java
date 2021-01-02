package cn.itcost.bs01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BSServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        while (true) {
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));

                        String line = br.readLine();
                        System.out.println(line);
                        String[] arr = line.split(" ");//.split(" ")
                        String path = arr[1].substring(1);
                        FileInputStream fis = new FileInputStream(path);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        OutputStream os = socket.getOutputStream();

                        os.write("HTTP/1.1 200 OK\r\n".getBytes());//HTTP/1.1 200 OK\r\n
                        os.write("Content‐Type:text/html\r\n".getBytes());//Content‐Type:text/html\r\n
                        os.write("\r\n".getBytes());

                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        fis.close();
                        socket.close();
                    } catch (Exception e) {

                    }
                }
            }).start();

        }
    }
}
