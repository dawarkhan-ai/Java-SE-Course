package multiThreading.theoryImplementation.threadClass.commonThreadMethods;

class SleepExample extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch(InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class SleepMethodExample {
    public static void main(String[] args) {
        new SleepExample().start();
    }
}
