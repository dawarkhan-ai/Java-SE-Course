package multiThreading.theoryImplementation.synchronization.counter;

class Counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

public class ProblemWithoutSync {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        };

        Runnable task2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count (without synchronization): " + counter.count);
    }
}
