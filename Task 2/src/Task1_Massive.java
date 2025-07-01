import java.util.Random;

public class Task1_Massive {

    static int[] carYear = new int[50];

    public static void run() {
        setCarYear();
        carsAfter2015();
        avarageCarsAge();
    }

    public static void setCarYear() {
        Random random = new Random();
        for (int i = 0; i < carYear.length; i++) {
            carYear[i] = random.nextInt(2026 - 2000) + 2000;
        }
    }

    public static void carsAfter2015() {
        System.out.println("Машины, выпущенные после 2015 года:");
        for (int year : carYear) {
            if (year > 2015) {
                System.out.print(year + " ");
            }
        }
        System.out.println();
    }

    public static void avarageCarsAge() {
        int totalAge = 0;
        int totalAgeAfter2015 = 0;
        int countAfter2015 = 0;
        int currentYear = 2025;

        for (int year : carYear) {
            int age = currentYear - year;
            totalAge += age;
            if (year > 2015) {
                totalAgeAfter2015 += age;
                countAfter2015++;
            }
        }

        double averageAge = (double) totalAge / carYear.length;
        double averageAgeAfter2015 = countAfter2015 > 0
                ? (double) totalAgeAfter2015 / countAfter2015
                : 0;

        System.out.printf("Средний возраст всех авто: %.2f лет%n", averageAge);
        System.out.printf("Средний возраст авто после 2015 года: %.2f лет%n", averageAgeAfter2015);
    }
}
