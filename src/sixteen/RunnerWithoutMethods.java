package sixteen;

import java.util.Scanner;

//1. Плюсы:
//   весь код находится в одном месте.
//   меньше файлов и классов.
//   все переменные находятся в области видимости main.
//
//2. Минусы:
//   дублирование кода.
//   весь код в одном месте, следовательно его переиспользование и поддержка муторнее.
//   не подходит для большых подзадач.

public class RunnerWithoutMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] array = new float[5];
        int countNegative = 0;
        int minIndex = -1;
        float minNegative = Float.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            try {
                System.out.print("Введите число для элемента " + i + ": ");
                array[i] = Float.parseFloat(scanner.nextLine());

                if (array[i] < 0) {
                    countNegative++;
                    if (array[i] < minNegative) {
                        minNegative = array[i];
                        minIndex = i;
                    }
                } else if (array[i] == 0) {
                    throw new Exception("Ошибка: в массиве есть нули.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введена символьная строка вместо числа.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (countNegative == 0) {
            System.out.println("Ошибка: отрицательные элементы отсутствуют.");
        } else {
            System.out.println("Минимальный отрицательный элемент: " + minNegative + ", его индекс: " + minIndex);
        }
    }
}
