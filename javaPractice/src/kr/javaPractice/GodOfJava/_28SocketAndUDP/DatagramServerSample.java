package kr.javaPractice.GodOfJava._28SocketAndUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerSample {
    public static void main(String[] args) {
        DatagramServerSample sample = new DatagramServerSample();
        sample.startServer();
    }

    public void startServer() {
        DatagramSocket server = null;
        try {
            server = new DatagramSocket(9999); //1
            int bufferLength = 256;
            byte[] buffer = new byte[bufferLength];
            DatagramPacket packet = new DatagramPacket(buffer, bufferLength); //2
            while (true) {
                System.out.println("Server:Waiting for request");
                server.receive(packet); //3
                int dataLength = packet.getLength(); //4
                System.out.println("Server : received. Data length=" + dataLength);
                String data = new String(packet.getData(), 0, dataLength); //5
                System.out.println("Received data : " + data);
                if (data.equals("EXIT")) {
                    System.out.println("Stop DatagramServer");
                    break;
                }
                System.out.println("------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close(); //6
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
