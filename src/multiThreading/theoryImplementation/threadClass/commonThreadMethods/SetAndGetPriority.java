package multiThreading.theoryImplementation.threadClass.commonThreadMethods;

public class SetAndGetPriority extends Thread {
    public void run() {
        System.out.println("Current Thread with Priority: " + getPriority());
    }

    public static void main(String[] args) {
        SetAndGetPriority t1 = new SetAndGetPriority();
        t1.setPriority(Thread.MAX_PRIORITY); //10
        t1.start();
        System.out.println("Main Thread");
    }
}
