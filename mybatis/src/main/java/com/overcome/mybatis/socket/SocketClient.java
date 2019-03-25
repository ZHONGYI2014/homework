package com.overcome.mybatis.socket;

import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SocketClient {

    private static String _pattern = "yyyy-MM-dd HH:mm:ss SSS";

    private static SimpleDateFormat format = new SimpleDateFormat(_pattern);

    public static int _sec = 5;

    public static void main(String[] args) {
        System.out.println("------------Client---------------");
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 8001);
            socket.setSoTimeout(_sec * 1000);
            System.out.println(format.format(new Date()));
            System.out.println("client与server端建立了连接");
            // 向服务器发送请求信息
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            System.out.println("我开始写啦");
            Thread.sleep(1);
            writer.write("Hi~,socket服务端，我叫tom ！");
            System.out.println(format.format(new Date()));
            System.out.println("写完啦，你收下");
            writer.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(format.format(new Date()) + "\n" + _sec + "秒的时间 告诉我你收到了吗\n");
            System.out.println(format.format(new Date()) + "\nServer:" + br.readLine());
        } catch (SocketTimeoutException e) {
            System.out.println(format.format(new Date()) + "\n" + _sec + "秒没收到回复 我下啦\n\n\n");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
