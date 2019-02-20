package CaseStudy;

public class BankApp {
    public static void main(String[] args) {

        Customer customer = new Customer("Dark",1985);
        bankAccount acc = new bankAccount("ACC191",900000.00,customer);

        System.out.println(acc.getInfo());
        acc.deposit(90000);
        System.out.println(acc.getInfo());
        acc.withdraw(45000);
        System.out.println(acc.checkBalance());
    }


}
