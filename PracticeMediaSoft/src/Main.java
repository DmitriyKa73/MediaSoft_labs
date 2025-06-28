public class Main {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount("Иван");
        BankAccount person2 = new BankAccount("Мария");

        person1.deposit(500);
        person1.displayInfo();

        person1.withdraw(200);
        person1.displayInfo();

        person1.transfer(person2, 150);
        person1.displayInfo();
        person2.displayInfo();

        boolean result = person1.withdraw(1500);
        System.out.println("Снятие денег: " + (result ? "успешно" : "неуспешно"));
    }
}
