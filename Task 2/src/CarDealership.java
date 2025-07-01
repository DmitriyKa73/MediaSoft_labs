import java.util.*;
import java.util.stream.Collectors;

public class CarDealership {
    private List<Car> cars = new ArrayList<>();

    public boolean addCar(Car car) {
        for (Car c : cars) {
            if (c.getVin().equals(car.getVin())) return false;
        }
        return cars.add(car);
    }

    public List<Car> findByManufacturer(String manufacturer) {
        List<Car> result = new ArrayList<>();
        for (Car c : cars) {
            if (c.getManufacturer().equalsIgnoreCase(manufacturer)) {
                result.add(c);
            }
        }
        return result;
    }

    public double averagePriceByType(CarType type) {
        double sum = 0;
        int count = 0;
        for (Car c : cars) {
            if (c.getType() == type) {
                sum += c.getPrice();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public List<Car> getSortedByYear() {
        List<Car> sorted = new ArrayList<>(cars);
        Collections.sort(sorted);
        return sorted;
    }

    public Map<CarType, Integer> getTypeStatistics() {
        Map<CarType, Integer> stats = new HashMap<>();
        for (Car c : cars) {
            CarType type = c.getType();
            stats.put(type, stats.getOrDefault(type, 0) + 1);
        }
        return stats;
    }

    public Optional<Car> getOldestCar() {
        return cars.stream().min(Comparator.comparingInt(Car::getYear));
    }

    public Optional<Car> getNewestCar() {
        return cars.stream().max(Comparator.comparingInt(Car::getYear));
    }
}
