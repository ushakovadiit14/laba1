import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        methods utils = new methods(); // Создаем экземпляр класса methods

        System.out.print("Выберите задание (1-20):\n (1) Задание 1.2 - Сумма последних цифр\n (2) Задание 1.4 - Проверка положительности\n " +
                "(3) Задание 1.6 - Проверка регистра буквы\n (4)Задание 1.8 - Проверка делимости\n (5)Задание 1.10 - Сумма последних цифр двух чисел\n" +
                " (6) Задание 2.2 - Безопасное деление\n (7)Задание 2.4 - Сравнение чисел\n (8)Задание 2.6 - Тройная сумма\n (9)Задание 2.8 - Склонение возраста\n " +
                "(10) Задание 2.10 - Дни недели\n (11) Задание 3.2 - Обратный отсчет\n (12) Задание 3.4 - Возведение в степень\n (13) Задание 3.6 - Одинаковые цифры\n " +
                "(14) Задание 3.8 - Треугольник из звездочек\n (15) Задание 3.10 - Игра \"Угадайка\" \n (16) Задание 4.2 - Поиск последнего вхождения\n" +
                " (17) Задание 4.4 - Вставка в массив\n (18) Задание 4.6 - Реверс массива\n (19) Задание 4.8 - Объединение массивов\n (20) Задание 4.10 - Удаление отрицательных чисел");

        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите задание (1-20): ");
            scanner.next(); // очищаем неправильный ввод
        }
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                utils.sumLastNums2();
                break;
            case 2:
                utils.isPositive2();
                break;
            case 3:
                utils.isUpperCase2();
                break;
            case 4:
                utils.isDivisor2();
                break;
            case 5:
                utils.lastNumSum2();
                break;
            case 6:
                utils.safeDiv2();
                break;
            case 7:
                utils.makeDecision2();
                break;
            case 8:
                utils.sum32();
                break;
            case 9:
                utils.age2();
                break;
            case 10:
                utils.printDays2();
                break;
            case 11:
                utils.reverseListNums2();
                break;
            case 12:
                utils.pow2();
                break;
            case 13:
                utils.equalNum2();
                break;
            case 14:
                utils.leftTriangle2();
                break;
            case 15:
                utils.guessGame2();
                break;
            case 16:
                utils.findLast2();
                break;
            case 17:
                utils.add2();
                break;
            case 18:
                utils.reverse2();
                break;
            case 19:
                utils.concat2();
                break;
            case 20:
                utils.deleteNegative2();
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }
}
