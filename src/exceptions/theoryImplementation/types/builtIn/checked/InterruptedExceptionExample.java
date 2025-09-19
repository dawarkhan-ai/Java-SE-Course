package exceptions.theoryImplementation.types.builtIn.checked;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                System.out.println("Thread sleeping...");
                Thread.sleep(5000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException occurred: " + e.getMessage());
            }
        });

        t.start();
        t.interrupt();  // Interrupt the thread
    }

}
