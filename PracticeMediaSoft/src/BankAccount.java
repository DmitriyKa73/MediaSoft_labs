import java.time.LocalDateTime;

public class BankAccount {
    private String name;
    private int balance;
    private LocalDateTime dateOpened;
    private boolean isBlocked;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
        this.dateOpened = LocalDateTime.now();
        this.isBlocked = false;
    }

        public void displayInfo() {
        System.out.println("Имя владельца: " + name);
        System.out.println("Баланс: " + balance);
        System.out.println("Дата открытия: " + dateOpened);
        System.out.println("Счёт заблокирован: " + isBlocked);
    }

    public boolean deposit(int amount) {
        if(amount<=0 || isBlocked)
            return false;
        balance += amount;
        return true;
        }

    public boolean withdraw(int amount){
        if(amount<=0 || balance<amount || isBlocked)
            return false;
        balance -=amount;
        return true;
    }

    public boolean transfer(BankAccount otherAccount, int amount) {
        if (otherAccount==null || isBlocked || otherAccount.isBlocked)
            return false;
        if (amount<=0 || amount>balance)
            return false;
        balance -=amount;
        return true;
    }
}
