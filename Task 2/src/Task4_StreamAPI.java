import java.util.*;
import java.util.stream.Collectors;

public class Task4_StreamAPI {
    public static void run() {
        List<Car> cars = Arrays.asList(
                new Car("VIN101", "Camry", "Toyota", 2019, 45000, 22000, CarType.SEDAN),
                new Car("VIN102", "Model 3", "Tesla", 2023, 15000, 55000, CarType.ELECTRIC),
                new Car("VIN103", "Octavia", "Skoda", 2018, 70000, 15000, CarType.SEDAN),
                new Car("VIN104", "X5", "BMW", 2022, 30000, 60000, CarType.SUV),
                new Car("VIN105", "Leaf", "Nissan", 2021, 20000, 30000, CarType.ELECTRIC)
        );

        System.out.println("Машины с пробегом < 50 000 км:");
        for (Car car : cars) {
            if (car.getMileage() < 50000) {
                System.out.println(car);
            }
        }

        System.out.println("\nТоп-3 самых дорогих машин:");
        cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .limit(3)
                .forEach(System.out::println);

        double avgMileage = cars.stream()
                .mapToInt(Car::getMileage)
                .average()
                .orElse(0);
        System.out.printf("\nСредний пробег: %.2f км%n", avgMileage);

        System.out.println("\nГруппировка по производителю:");
        Map<String, List<Car>> byManufacturer = new HashMap<>();
        for (Car car : cars) {
            String man = car.getManufacturer();
            if (!byManufacturer.containsKey(man)) {
                byManufacturer.put(man, new ArrayList<>());
            }
            byManufacturer.get(man).add(car);
        }
        for (String man : byManufacturer.keySet()) {
            System.out.println(man + ": " + byManufacturer.get(man).size() + " машин");
        }
    }
}
