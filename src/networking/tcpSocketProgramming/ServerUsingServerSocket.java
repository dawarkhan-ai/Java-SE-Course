package networking.tcpSocketProgramming;

import java.io.*;
import java.net.*;

public class ServerUsingServerSocket {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Server started and Waiting for client...");
        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String msg = in.readLine();
        System.out.println("Client says: " + msg);

        server.close();
    }
}
