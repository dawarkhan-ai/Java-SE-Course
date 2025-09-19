package multiThreading.theoryImplementation.creatingThreads;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable Interface object is running...");
    }
}

public class UsingImplementingRunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
