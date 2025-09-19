package networking.udpSocketProgramming;

import java.io.*;
import java.net.*;

public class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();

        String msg = "Hello via UDP!";
        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), ip, 1234);
        socket.send(packet);
        socket.close();

    }
}
