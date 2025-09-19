package multiThreading.problems.simple.demonstrateThreadClassMethod;

public class IsAliveYieldInterruptExample extends Thread {
    public void run() {
        System.out.println("Thread running...");
        Thread.yield();
    }

    public static void main(String[] args) throws InterruptedException {
        IsAliveYieldInterruptExample t = new IsAliveYieldInterruptExample();
        t.start();
        System.out.println("Is Allive: " + t.isAlive());  // true
        t.join();
    }
}
