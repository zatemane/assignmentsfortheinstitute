package sixteen;

import java.util.Scanner;

//1. Плюсы:
//   задача разделена на отдельные методы, каждый из которых выполняет конкретную подзадачу, что
//   упрощает понимание кода.
//   методы могут быть вызваны из других частей программы для выполнения аналогичных задач.
//
//2. Минусы:
//   для выполнения простых задач использование отдельных методов излишне.

public class RunnerWithMethods {
    public static void main(String[] args) {
        float[] array = new float[5];

        fillArray(array);
        findMinNegative(array);
    }

    public static void fillArray(float[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print("Введите число для элемента " + i + ": ");
                array[i] = Float.parseFloat(scanner.nextLine());

                if (array[i] == 0) {
                    throw new Exception("Ошибка: в массиве есть нули.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введена символьная строка вместо числа.");
                i--;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
    }

    public static void findMinNegative(float[] array) {
        int countNegative = 0;
        int minIndex = -1;
        float minNegative = Float.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countNegative++;
                if (array[i] < minNegative) {
                    minNegative = array[i];
                    minIndex = i;
                }
            }
        }

        if (countNegative == 0) {
            System.out.println("Ошибка: отрицательные элементы отсутствуют.");
        } else {
            System.out.println("Минимальный отрицательный элемент: " + minNegative + ", его индекс: " + minIndex);
        }
    }
}
