package multiThreading.problems.intermediate;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    synchronized void deposit(double Amount) {
        balance = balance + Amount;
    }

    synchronized void withDraw(double Amount) {
        if (Amount <= balance) {
            balance = balance - Amount;
        } else {
            System.out.println("InSufficient Balance!");
        }
    }

    double getBalance() {
        return balance;
    }
}

class User extends Thread {
    BankAccount Account;

    User(BankAccount Account) {
        this.Account = Account;
    }

     public void run() {
        for(int i = 1; i <= 1000; i++) {
            Account.deposit((double)i);
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) throws Exception {
        BankAccount Account = new BankAccount(0);

       User user1 = new User(Account);
       user1.start();

       User user2 = new User(Account);
       user2.start();

       user1.join();
       user2.join();

       System.out.println("Balance - " + Account.getBalance());
    }
}
