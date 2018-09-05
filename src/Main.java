import java.util.Scanner;

/**
 * Класс предназначенный для умножения двух чисел без оператора умножения.
 *
 * @author Barinov 15IT18
 */

public class Main {

    private static Scanner scaner = new Scanner(System.in);
    private static int firstNumber;
    private static int secondNumber;
    private static int result;

    public static void main(String[] args) {

        System.out.println("Введите первое число: ");
        firstNumber = scaner.nextInt();
        System.out.println("Введите второе число: ");
        secondNumber = scaner.nextInt();

        long start = System.currentTimeMillis();

        if ((firstNumber < 0 && secondNumber < 0) || (firstNumber > 0 && secondNumber < 0)) {
            firstNumber = -firstNumber;
            secondNumber = -secondNumber;
        }

        long finish = System.currentTimeMillis() - start;
        System.out.println("Результат вычислий: " + resultati(firstNumber, secondNumber));
        System.out.println("Время вычислений заняло: " + finish  + " mc");

    }

    /**
     * Метод для выполнения операции умножения без оператора умножения.
     *
     * @param firstNumber
     * @param secondNumber
     * @return результаты вычислений.
     */
    private static int resultati(int firstNumber, int secondNumber) {

        for (int i = 0; i < secondNumber; i++) {
            result += firstNumber;
        }

        return result;
    }
}

