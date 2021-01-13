package cn.itcost.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9000);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("E:\\b");//这一步不算创建文件夹吗?
        if (!file.exists()) {
            file.mkdirs();
        }
        String filename = "itcast" + System.currentTimeMillis() + "#" + new Random().nextInt(10) + ".jpg";
        FileOutputStream fos = new FileOutputStream(file + "\\" + filename);
        System.out.println("111111111111");
        int len = 0;
        byte[] bytes = new byte[1024];

        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        ///后面的代码不会实现.
        System.out.println("222222222222222");
        socket.getOutputStream().write("上传成功".getBytes());
        fos.close();
        socket.close();
        server.close();
    }
}
