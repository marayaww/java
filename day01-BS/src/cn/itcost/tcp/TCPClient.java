package cn.itcost.tcp;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 总的来说就是,服务器与客户端建立连接,
 * 首先就是客户端发送请求,建立对象(逻辑练习)
 * 1客户端首先获取输出流,服务器获取输入流用来接收输入流,
 * 2,服务器回应时,服务器首先获取输出流,客户端获取输入流,有来接丧偶服务器的回写数据.
 */

public class TCPClient {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:\\a\\1.jpg");
        Socket socket = new Socket("127.0.0.1", 9000);
        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        System.out.println("3333333333333");
        //这里的read,读取不到-1,while循环就结束了,Server端的read就接收不到-1这个结束标记,形成阻塞.
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //shutDownOutput方法的作用是禁用此套接字的输出流,相当于一个输出流的结束标记.
        //关闭输出流,通知服务端,写出数据完毕.
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        System.out.println("555555555555");
        //这里的循环也读取不到-1的结束标记.
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        //这里的代码也就不会实现了,也就接受不到服务器端的字节流.形成阻塞,一直等待.
        System.out.println("444444444444444");
//        socket.shutdownOutput();
        fis.close();
        socket.close();
    }
}
