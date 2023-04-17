package interface_comparable;

import java.util.Arrays;

/**
 * Дописати логіку, щоб метод compareTo() здійснив пошук за швидкістю (якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за ціною) -> ціною -> моделі -> кольору машини.
 */

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");

        Car[] c = {c1, c2, c3};

        System.out.println("Якщо ж швидкість у 2-х об'єктів дорівнює, то шукаємо за ціною:");
        printSortedCars(c);
        System.out.println("Відбулось сортування за ціною");
        System.out.println("------------------------------------------------------------------------");

        c2.setPrice(c1.getPrice());
        System.out.println("Якщо ж швидкість та ціна у 2-х об'єктів рівні, то шукаємо за моделлю:");
        printSortedCars(c);
        System.out.println("Відбулось сортування за моделлю");
        System.out.println("------------------------------------------------------------------------");

        c2.setModel(c1.getModel());
        System.out.println("Якщо ж швидкість, ціна та моделі у 2-х об'єктів однакові, то шукаємо за кольором:");
        printSortedCars(c);
        System.out.println("Відбулось сортування за кольором");
    }

    private static void printSortedCars(Car[] c) {
        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
