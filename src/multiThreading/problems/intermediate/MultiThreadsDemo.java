package multiThreading.problems.intermediate;

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 4; i++) {
                System.out.println((i + 1));
                sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
}

class MyRunnable implements Runnable {
    public  void run() {
        for(int i = 65; i <= 69; i++) {
            System.out.println((char)i);
        }
    }
}

public class MultiThreadsDemo {
    public static void main(String[] args) {
        MyThread Thread1 = new MyThread();
        Thread1.start();

        Thread Thread2 = new Thread(new MyRunnable());
        Thread2.setPriority(Thread.MAX_PRIORITY);
        Thread2.start();

        Thread Thread3 = new Thread(){
            public void run() {
                for(int i = 0; i <= 2; i++) {
                    System.out.println("Times - " + (i+1));
                }
            }
        };
        Thread3.start();

        try {
            Thread1.join();
            Thread2.join();
            Thread3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All Threads Completed");
    }
}
