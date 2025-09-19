package multiThreading.problems.simple;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread name: " + getName());
    }
}

public class DemonstrateThreadClass extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread("CustomThread");
        t.start();
    }
}
