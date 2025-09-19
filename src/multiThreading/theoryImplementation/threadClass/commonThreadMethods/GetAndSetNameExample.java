package multiThreading.theoryImplementation.threadClass.commonThreadMethods;

public class GetAndSetNameExample extends Thread {
    public void run() {
        System.out.println("Thread name: " + getName());
    }

    public static void main(String[] args) {
        GetAndSetNameExample t1 = new GetAndSetNameExample();
        t1.setName("Thread-1");
        t1.start();

        GetAndSetNameExample t2 = new GetAndSetNameExample();
        t2.setName("Thread-2");
        t2.start();

    }
}
