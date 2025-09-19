package multiThreading.theoryImplementation.threadCommunication;

class SweetBox {
    private int sweetCount = 0;
    private final int CAPACITY = 5;

    // Producer method: Add a sweet
    public synchronized void produce() throws InterruptedException {
        while (sweetCount == CAPACITY ) {
            System.out.println("Box is full, producer waiting...");
            wait(); // put current thread into waiting state
        }

        sweetCount++;
        System.out.println("Producer added a sweet, count: " + sweetCount);
        notify();
    }

    // Consumer method: Take a sweet
    public synchronized void consume() throws InterruptedException {
        while(sweetCount == 0) {
            System.out.println("Box is empty, consumer waiting...");
            wait();
        }

        sweetCount--;
        System.out.println("Consumer took a sweet, count: " + sweetCount);
        notify();
    }
}

public class DemonstratingProducerConsumerProblem {
    public static void main(String[] args) {
        SweetBox box = new SweetBox();

        // Producer thread
        Thread producer = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        box.produce();
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer");

        // Consumer Thread
        Thread consumer = new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        box.consume();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer");

        producer.start();
        consumer.start();
    }
}
