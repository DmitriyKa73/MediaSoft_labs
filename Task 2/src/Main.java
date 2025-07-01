import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
            System.out.println("1 - Массивы (Task 1)");
            System.out.println("2 - Коллекции моделей (Task 2)");
            System.out.println("3 - Сравнение машин (Task 3)");
            System.out.println("4 - Stream API анализ (Task 4)");
            System.out.println("5 - Автоцентр (Task 5)");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Task1_Massive.run();
                    break;
                case 2:
                    Task2_Collections.run();
                    break;
                case 3:
                    Task3_CarEquals.run();
                    break;
                case 4:
                    Task4_StreamAPI.run();
                    break;
                case 5:
                    CarDealershipApp.run();
                    break;
                case 0:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}
