// Найти сумму элементов массива, которые:
// чётные
// и при этом положительные
// и стоят на нечётных индексах (то есть 1, 3, 5, ...)

// 8
// 2 -3 4 6 -1 8 5 10

// 24

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

        // Находим индексы минимального и максимального элементов
        for (int i = 0; i < n; i++)
        {
            if (arr[i] % 2 == 0 && arr[i] > 0 && i % 2 != 0)
            {
                chet = chet + arr[i];
            }
        }
        System.out.println(chet);
    }
}
