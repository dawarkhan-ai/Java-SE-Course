package multiThreading.theoryImplementation.threadClass.commonThreadMethods;

public class IsAliveExample extends Thread {
    public void run() {

    }

    public static void main(String[] args) {
        IsAliveExample t1 = new IsAliveExample();
        System.out.println("Before start: " + t1.isAlive());

        t1.start();
        System.out.println("After start: " + t1.isAlive());


    }
}
