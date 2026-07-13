package OOPs;



class Account {

    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Negative balance not allowed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.setBalance(5000);

        System.out.println(acc.getBalance());
    }
}
