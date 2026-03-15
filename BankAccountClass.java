class Bank{
    String name;
    String accountNum;
    Float balance;

    void play(){
        System.out.println("Name : " + name);
        System.out.println("Account Number : " + accountNum);
        System.out.println("Balance : " + balance);
    }

    void deposit(Float amount){
        balance += amount;
        System.out.println("Amount Deposited : " + amount);

    }

    void withdraw(Float amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn : " + amount);

        }
    }

}

public class BankAccountClass {
    public static void main(String[] args) {

        Bank b1 = new Bank();

        b1.name = "Kusuma";
        b1.accountNum = "1245t54";
        b1.balance = 100000000.0f;

        b1.play();
        b1.deposit(50000.0f);
        b1.withdraw(20000.0f);
        b1.withdraw(1000000.0f);
    }
    
}
