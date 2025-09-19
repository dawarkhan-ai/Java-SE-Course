package multiThreading.theoryImplementation.threadClass.commonConstructors;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Driving..." );
    }

}

public class DemonstratingThreadConstructorWithRunnableObjecAndThreadName {
    public static void main(String[] args) {
        MyRunnable car = new MyRunnable();

        Thread thread1 = new Thread(car, "Driver-1");
        Thread thread2 = new Thread(car, "Driver-2");

        thread1.start();
        thread2.start();
    }
}
