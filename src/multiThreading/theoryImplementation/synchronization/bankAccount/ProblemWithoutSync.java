package multiThreading.theoryImplementation.synchronization.bankAccount;

class BankAccount {
    private int balance = 1000;

    public  void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + ", balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }

}

public class ProblemWithoutSync {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

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

        // Start both threads
        t1.start();
        t2.start();
    }
}