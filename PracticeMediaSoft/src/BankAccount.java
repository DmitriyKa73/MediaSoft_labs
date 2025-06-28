import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class BankAccount {
    private String name;
    private int balance;
    private LocalDateTime dateOpened;
    private boolean isBlocked;
    private String number;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
        this.dateOpened = LocalDateTime.now();
        this.isBlocked = false;
        this.number = generateAccountNumber();
    }

    private String generateAccountNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public void displayInfo() {
        System.out.println(this);
    }

    public boolean deposit(int amount) {
        if (amount <= 0 || isBlocked) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {
        if (amount <= 0 || amount > balance || isBlocked) return false;
        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount otherAccount, int amount) {
        if (otherAccount == null || isBlocked || otherAccount.isBlocked) return false;
        if (amount <= 0 || amount > balance) return false;

        balance -= amount;
        otherAccount.balance += amount;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Счёт №%s | Владелец: %s | Баланс: %d | Дата открытия: %s | Заблокирован: %s",
                number, name, balance, dateOpened, isBlocked);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BankAccount)) return false;
        BankAccount other = (BankAccount) obj;
        return Objects.equals(this.number, other.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
