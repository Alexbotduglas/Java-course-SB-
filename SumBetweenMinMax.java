// Найти сумму элементов между
// минимальным и максимальным элементами массива (не включая их)

// Введите размер массива:
// 7
// Введите элементы массива:
// 3 9 4 2 1 5 7

// 6 - Result

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
        for (int i = 0; i < n; i++)
        {
            if(arr[i] < arr[minIndex])
            {
                minIndex = i;
            }
            if(arr[i] > arr[maxIndex])
            {
                maxIndex = i;
            }

        }

        int start = Math.min(minIndex, maxIndex);
        int end = Math.max(minIndex, maxIndex);

        int sum = 0;
        for (int i = start + 1; i < end; i++)
        {
            sum = sum + arr[i];
        }
        System.out.print(sum);
        // 3 9 4 2 1 5 7
    }
}
