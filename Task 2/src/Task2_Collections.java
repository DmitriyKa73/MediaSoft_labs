import java.util.*;

public class Task2_Collections {
    public static void run() {
        List<String> models = new ArrayList<>(Arrays.asList(
                "Toyota Camry", "BMW X5", "Tesla Model S", "BMW X5", "Toyota Camry", "Tesla Model 3", "Audi A6"
        ));

        Set<String> noDuplicates = new HashSet<>(models);
        List<String> sorted = new ArrayList<>(noDuplicates);
        sorted.sort(Collections.reverseOrder());

        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i).contains("Tesla")) {
                sorted.set(i, "ELECTRO_CAR");
            }
        }

        System.out.println("Модели без дубликатов, отсортированные:");
        sorted.forEach(System.out::println);

        Set<String> finalSet = new HashSet<>(sorted);
        System.out.println("Сохранено в Set: " + finalSet);
    }
}
