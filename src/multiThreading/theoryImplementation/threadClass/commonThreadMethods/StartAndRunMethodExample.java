package multiThreading.theoryImplementation.threadClass.commonThreadMethods;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class StartAndRunMethodExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Correct way – starts a new thread

    }
}
