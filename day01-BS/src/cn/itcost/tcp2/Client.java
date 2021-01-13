package cn.itcost.tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 8800);
        OutputStream os = client.getOutputStream();
        os.write("你好,服务器".getBytes());
        byte[] bytes = new byte[1024];
        InputStream is = client.getInputStream();
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        is.close();
        os.close();


    }
}
