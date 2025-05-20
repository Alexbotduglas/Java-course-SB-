// Введите размер массива:
// 6
// Введите элементы массива:
// 4 2 9 10 0 5

// Изменённый массив:
// 4 2 9 0 10 5

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

        int minIndex = 0;
        int maxIndex = 0;

        // Находим индексы минимального и максимального элементов
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Меняем местами минимальный и максимальный элементы
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        // Выводим изменённый массив
        System.out.println("Изменённый массив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
