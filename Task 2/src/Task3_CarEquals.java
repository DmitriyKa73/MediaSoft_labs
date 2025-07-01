import java.util.*;

public class Task3_CarEquals {
    public static void run() {
        Set<Car> cars = new HashSet<>();

        Car car1 = new Car("VIN001", "Model S", "Tesla", 2022, 10000, 75000, CarType.ELECTRIC);
        Car car2 = new Car("VIN002", "X5", "BMW", 2020, 20000, 50000, CarType.SUV);
        Car car3 = new Car("VIN001", "Model S", "Tesla", 2022, 10000, 75000, CarType.ELECTRIC); // дубликат

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("HashSet без дубликатов VIN:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nСортировка по году выпуска:");
        List<Car> sorted = new ArrayList<>(cars);
        Collections.sort(sorted);
        for (Car car : sorted) {
            System.out.println(car);
        }
    }
}
