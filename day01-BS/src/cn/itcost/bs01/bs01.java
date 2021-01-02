package cn.itcost.bs01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class bs01 {
    public static void main(String[] args) throws Exception {
        ServerSocket server=new ServerSocket(9000);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
        server.close();
    }
}
