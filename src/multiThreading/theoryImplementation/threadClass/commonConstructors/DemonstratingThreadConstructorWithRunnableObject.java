package multiThreading.theoryImplementation.threadClass.commonConstructors;

class Task implements Runnable {
    public void run() {
        System.out.println("Task is running using Thread Constructor with Runnable object.");
    }
}

public class DemonstratingThreadConstructorWithRunnableObject {
    public static void main(String[] args) {
        Thread t = new Thread(new Task());
        t.start();
    }
}
