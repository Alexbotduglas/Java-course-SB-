// Задание:
// Найди сумму всех положительных элементов массива,
// которые стоят на чётных индексах (то есть 0, 2, 4, …).

// Введите размер массива:
// 6
// Введите элементы массива:
// 5 -3 7 -1 2 4

// 14

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

        int chet = 0;
        int nechet = 0;
        int sum = 0;

        // Находим индексы минимального и максимального элементов
        for (int i = 0; i < n; i++)
        {
            if(i % 2 == 0 && arr[i] > 0)
            {
                sum = sum + arr[i];
            }
        }
        // 1 2 3 4 5 6
        System.out.println(sum);
    }
}
