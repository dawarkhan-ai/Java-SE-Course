package exceptions.problems;

import java.io.IOException;

class Sample {
   static void readData() throws IOException{
       System.out.println("This method throws IOexception and checked at compile time. \n");
       throw new IOException("Sample Exception");
   }
}

public class ReadDataMethodThrowsException {
    public static void main(String[] args) {
        try{
            Sample.readData();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
