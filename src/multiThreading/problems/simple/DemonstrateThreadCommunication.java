package multiThreading.problems.simple;

class Shared {
    int num;
    boolean valueSet = false;

    synchronized void produce(int n) throws InterruptedException {
        while (valueSet) wait();
        num = n;
        System.out.println("Produced: " + n);
        valueSet = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!valueSet) wait();
        System.out.println("Consumed: " + num);
        valueSet = false;
        notify();
    }
}

public class DemonstrateThreadCommunication {
    public static void main(String[] args) {
        Shared s = new Shared();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) s.produce(i);
            } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) s.consume();
            } catch (Exception e) {}
        }).start();

    }
}
