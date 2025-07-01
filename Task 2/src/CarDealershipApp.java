import java.util.Scanner;

public class CarDealershipApp {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        CarDealership dealership = new CarDealership();

        while (true) {
            System.out.println("=== АВТОЦЕНТР ===");
            System.out.println("1 - Добавить машину");
            System.out.println("2 - Найти по производителю");
            System.out.println("3 - Средняя цена по типу");
            System.out.println("4 - Сортировка по году");
            System.out.println("5 - Статистика");
            System.out.println("0 - Назад");
            System.out.print("Выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("VIN: ");
                    String vin = scanner.nextLine();
                    System.out.print("Модель: ");
                    String model = scanner.nextLine();
                    System.out.print("Производитель: ");
                    String man = scanner.nextLine();
                    System.out.print("Год: ");
                    int year = scanner.nextInt();
                    System.out.print("Пробег: ");
                    int mileage = scanner.nextInt();
                    System.out.print("Цена: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Тип (SEDAN/SUV/ELECTRIC): ");
                    CarType type = CarType.valueOf(scanner.nextLine().toUpperCase());

                    boolean added = dealership.addCar(new Car(vin, model, man, year, mileage, price, type));
                    System.out.println(added ? "✅ Машина добавлена" : "❌ VIN уже есть");
                    break;

                case 2:
                    System.out.print("Производитель: ");
                    String search = scanner.nextLine();
                    for (Car c : dealership.findByManufacturer(search)) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.print("Тип: ");
                    CarType t = CarType.valueOf(scanner.nextLine().toUpperCase());
                    System.out.printf("Средняя цена: %.2f%n", dealership.averagePriceByType(t));
                    break;

                case 4:
                    for (Car c : dealership.getSortedByYear()) {
                        System.out.println(c);
                    }
                    break;

                case 5:
                    for (CarType key : dealership.getTypeStatistics().keySet()) {
                        System.out.println(key + ": " + dealership.getTypeStatistics().get(key));
                    }
                    dealership.getOldestCar().ifPresent(c -> System.out.println("Старая: " + c));
                    dealership.getNewestCar().ifPresent(c -> System.out.println("Новая: " + c));
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}
