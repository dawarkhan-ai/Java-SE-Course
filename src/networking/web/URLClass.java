package networking.web;

import java.net.*;

public class URLClass {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com/");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Path: " + url.getPath());
    }
}
