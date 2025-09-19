package networking.web;

import java.net.*;
import java.io.*;

public class WebConnectionUsingURLClass {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.google.com/");
        URLConnection con = url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
