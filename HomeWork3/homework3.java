package HomeWork3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class homework3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            list.add(number);
        }

        System.out.println("Исходный список чисел: " + list);

        // 2) Находим минимальное значение
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        // 3) Находим максимальное значение
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        // 4) Находим среднее значение
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = sum / list.size();

        // 1) Удаляем четные числа
        list.removeIf(n -> n % 2 == 0);

        System.out.println("Список после удаления четных чисел: " + list);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
