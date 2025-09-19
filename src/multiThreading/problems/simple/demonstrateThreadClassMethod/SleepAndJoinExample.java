package multiThreading.problems.simple.demonstrateThreadClassMethod;

public class SleepAndJoinExample extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) throws InterruptedException  {
        SleepAndJoinExample t = new SleepAndJoinExample();
        t.start();
        t.join();
        System.out.println("Main finished after t1");
    }
}
