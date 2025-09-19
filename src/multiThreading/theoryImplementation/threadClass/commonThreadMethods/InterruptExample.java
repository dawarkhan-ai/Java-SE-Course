package multiThreading.theoryImplementation.threadClass.commonThreadMethods;

class InterruptExample extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Woke up!");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }

    public static void main(String[] args) {
        InterruptExample t1 = new InterruptExample();
        t1.start();
        t1.interrupt(); // Interrupts sleep after 3 sec
    }
}
