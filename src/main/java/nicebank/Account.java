package nicebank;

public class Account {

    private int balance;

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
