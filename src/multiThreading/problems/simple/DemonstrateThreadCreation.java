package multiThreading.problems.simple;

public class DemonstrateThreadCreation extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        DemonstrateThreadCreation t = new  DemonstrateThreadCreation();
        t.start();
    }
}
