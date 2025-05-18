// 📌 Задача
// Найти непрерывный подмассив (subarray), сумма которого максимальна.

// 💡 Идея алгоритма Кадане
// При проходе по массиву мы накапливаем текущую сумму и в каждый момент решаем:

// стоит ли продолжать текущее накопление или начать заново с текущего элемента.

// 📈 Почему это эффективно:
// Время: O(n)
// Память: O(1) (используем всего 2 переменные)

// 9 
// -2 1 -3 4 -1 2 1 -5 4
// 6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод длины массива
        int n = sc.nextInt();
        int[] arra = new int[n];

        // Ввод элементов массива
        for (int i = 0; i < n; i++) {
            arra[i] = sc.nextInt();
        }

        // Алгоритм Кадане
        int maxSum = arra[0];
        int currentSum = arra[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arra[i], currentSum + arra[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}
