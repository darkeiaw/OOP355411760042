package CaseStudy;

public class bankAccount {

    private String id;
    private double balance;
    private Customer cus;

    public bankAccount(String id, double balance, Customer cus) {
        this.id = id;
        this.balance = balance;
        this.cus = cus;
    }

    public String getInfo() {
        return "[Acc ID: "+this.id+" Name: "+cus.getName()+" Balance: "+this.balance+"]";
    }
    public String getId() {
        return id;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount; //balnce = balance+amount;
    }
    public void withdraw (double amount) {
        this.balance -= amount; //balnce = balance-amount;
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }
}
