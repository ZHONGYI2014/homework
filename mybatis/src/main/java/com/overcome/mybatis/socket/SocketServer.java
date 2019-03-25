package com.overcome.mybatis.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SocketServer {

    private static String _pattern = "yyyy-MM-dd HH:mm:ss SSS";

    private static SimpleDateFormat format = new SimpleDateFormat(_pattern);

    // 设置超时
    public static int _sec = 0;

    public static void main(String[] args) {

        System.out.println("socket server: " + format.format(new Date()));
        ServerSocket server;

        try {
            server = new ServerSocket(8001);
            System.out.println("开始监听" + server.getLocalPort() + "端口请求 ");
            Socket socket = server.accept();
            System.out.println(format.format(new Date()));
            System.out.println("server与client端建立了连接");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            socket.setSoTimeout(_sec * 1000);
            System.out.println(format.format(new Date()) + "\n" + _sec + "秒的时间 快写\n");
            System.out.println(format.format(new Date()) + "\nClient:" + br.readLine() + "\n");
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            System.out.println(format.format(new Date()));
            System.out.println("我是server端正在回复你client");
            //发给客户端的内容
            writer.write("收到\n");
            Thread.sleep(1);
            writer.flush();
            System.out.println(format.format(new Date()));
            System.out.println("我要返回server端的数据啦");
        } catch (SocketTimeoutException e) {
            System.out.println(format.format(new Date()) + "\n" + _sec + "秒没给我数据 我下啦\n\n\n\n");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
