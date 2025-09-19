package networking.tcpSocketProgramming;

import java.io.*;
import java.net.*;

public class ClientUsingSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello Server!");

        socket.close();
    }
}
