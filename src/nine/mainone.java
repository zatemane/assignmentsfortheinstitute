package nine;

import java.util.Random;

public class mainone {
    public static void main(String[] args) {
        int[] array = generateRandomArray(10); // Генерируем случайный массив из 10 элементов
        printEveryThirdPositiveElement(array);
    }

    // случайный массив
    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(21) - 10; // Генерируем случайное число от -10 до 10
        }
        return array;
    }

    // +
    public static void printEveryThirdPositiveElement(int[] array) {
        int count = 0;
        for (int i = 2; i < array.length; i += 3) {
            if (array[i] > 0) {
                System.out.println("Третий положительный элемент: " + array[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В массиве нет положительных элементов на третьей позиции.");
        }
    }
}
