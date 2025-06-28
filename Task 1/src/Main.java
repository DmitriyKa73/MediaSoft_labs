public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Дима");
        BankAccount acc2 = new BankAccount("Дима");

        acc1.deposit(500);
        acc2.deposit(500);

        System.out.println(acc1);
        System.out.println(acc2);

        System.out.println("acc1.equals(acc2)? " + acc1.equals(acc2));
    }
}
