// Ввести массив из n целых чисел.
// Удалить все чётные элементы, оставив
// только нечётные, и вывести новый массив.

//Введите размер массива:
//8
//Введите элементы массива:
//4 7 2 9 6 5 8 3
//
//Вывод:
//7 9 5 3

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

        // Сначала считаем, сколько положительных и нулевых элементов
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        // Создаем массив нужного размера и заполняем его
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                newArr[index] = arr[i];
                index++;
            }
        }

        // Печатаем результат
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
