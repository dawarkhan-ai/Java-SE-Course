package multiThreading.theoryImplementation.synchronization.bankAccount.solutionWithSync;

class BankAccount2 {
    private int balance = 1000;

    // Method with synchronized block: locks only the critical section
    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + ", balance: $" + balance);
            } else {
                System.out.println("Insufficient balance for " + Thread.currentThread().getName());
            }
        }
    }
}

public class SyncBlockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // Create threads using anonymous inner class instead of lambda
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(600);
            }
        }, "Thread-1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.withdraw(600);
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
