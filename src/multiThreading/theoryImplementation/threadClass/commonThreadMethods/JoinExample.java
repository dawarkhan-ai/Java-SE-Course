package multiThreading.theoryImplementation.threadClass.commonThreadMethods;

public class JoinExample extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Running: " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();

        t1.start();
        t1.join();

        System.out.println("put thread2 in runnable state and running after t1 completes its task because join() is called");
        t2.start();
    }
}
