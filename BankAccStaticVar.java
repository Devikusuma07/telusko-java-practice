class BankAccount {
    String HolderName;
    double balance;
    static int totalAccounts;

    BankAccount(String name, double initialBalance) {
        HolderName = name;
        balance = initialBalance;
        totalAccounts++;
    }

    void display() {
        System.out.println("Name " + HolderName);
        System.out.println("Balance " + balance);
    }
}

public class BankAccStaticVar {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Devi", 5000);
        BankAccount acc2 = new BankAccount("kusu", 10000);
        BankAccount acc3 = new BankAccount("Akula", 7000);
        acc1.display();
        acc2.display();
        acc3.display();
        System.out.println("Total Accounts: " + BankAccount.totalAccounts);
        
    }   
}
