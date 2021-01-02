package cn.itcost.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss=new ServerSocket(8800);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        byte[] bytes=new byte[1024];
        int len = is.read(bytes);
        OutputStream os = server.getOutputStream();
        os.write("你好,谢谢你".getBytes());
        os.close();
        is.close();
        server.close();
    }
}
