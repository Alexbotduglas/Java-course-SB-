// Задание: Подсчитать количество положительных, отрицательных и нулей в массиве

// Введите размер массива:
// 6
// Введите элементы массива:
// 4 -2 0 1 -3 0

// Положительных: 2
// Отрицательных: 2
// Нулей: 2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positives++;
            } else if (arr[i] < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        System.out.println("Положительных: " + positives);
        System.out.println("Отрицательных: " + negatives);
        System.out.println("Нулей: " + zeros);
    }
}

