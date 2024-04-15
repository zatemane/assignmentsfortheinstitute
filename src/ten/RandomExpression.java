package ten;

import java.util.Random;
//Цифры - 2 (первая не может быть нулем), английские буквы - 3
//(разные), символ «точка», цифры – 2 (нечетные)
public class RandomExpression {
    public static void main(String[] args) {
        Random random = new Random();

        StringBuilder expression = new StringBuilder();

        // 1
        int firstDigit = random.nextInt(9) + 1;
        expression.append(firstDigit);

        // 2
        int secondDigit = random.nextInt(10);
        expression.append(secondDigit);

        // буквы
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + random.nextInt(26));
            while (expression.indexOf(String.valueOf(letter)) != -1) {
                letter = (char) ('A' + random.nextInt(26));
            }
            expression.append(letter);
        }

        // Генерация точки
        expression.append(".");

        // Генерация двух нечетных цифр
        for (int i = 0; i < 2; i++) {
            int oddDigit = random.nextInt(5) * 2 + 1;
            expression.append(oddDigit);
        }

        System.out.println("Выражение: " + expression.toString());
    }
}


