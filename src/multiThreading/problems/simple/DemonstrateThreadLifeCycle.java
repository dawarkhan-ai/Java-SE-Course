package multiThreading.problems.simple;

public class DemonstrateThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("Thread is running...: Running state");
    }

    public static void main(String[] args) throws InterruptedException {
        DemonstrateThreadLifeCycle t = new DemonstrateThreadLifeCycle();

        System.out.println("State: " + t.getState());  // New

        t.start();
        System.out.println("State after start(): " + t.getState()); // most likely runnable

        t.join(); // Wait for thread to die
        System.out.println("State after join(): " + t.getState()); // Terminated
    }
}
