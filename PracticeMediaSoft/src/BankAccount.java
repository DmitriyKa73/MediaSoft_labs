import java.time.LocalDateTime;

public class BankAccount {
    private String name;
    private int balance;
    private LocalDateTime dateOpened;
    private boolean isBlocked;

    // конструктор
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

}
