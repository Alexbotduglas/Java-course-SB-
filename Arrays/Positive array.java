//Введите размер массива:
//8
//Введите элементы массива:
//4 -1 0 7 -3 5 -2 9

//Вывод:
//4 0 7 5 9

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
            if (arr[i] >= 0) {
                count++;
            }
        }

        // Создаем массив нужного размера и заполняем его
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
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
