import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите задание (1-20): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите задание (1-20): ");
            scanner.next(); // очищаем неправильный ввод
        }
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                methods.sumLastNums2();
                break;
            case 2:
                methods.isPositive2();
                break;
            case 3:
                methods.isUpperCase2();
                break;
            case 4:
                methods.isDivisor2();
                break;
            case 5:
                methods.lastNumSum2();
                break;
            case 6:
                methods.safeDiv2();
                break;
            case 7:
                methods.makeDecision2();
                break;
            case 8:
                methods.sum32();
                break;
            case 9:
                methods.age2();
                break;
            case 10:
                methods.printDays2();
                break;
            case 11:
                methods.reverseListNums2();
                break;
            case 12:
                methods.pow2();
                break;
            case 13:
                methods.equalNum2();
                break;
            case 14:
                methods.leftTriangle2();
                break;
            case 15:
                methods.guessGame2();
                break;
            case 16:
                methods.findLast2();
                break;
            case 17:
                methods.add2();
                break;
            case 18:
                methods.reverse2();
                break;
            case 19:
                methods.concat2();
                break;
            case 20:
                methods.deleteNegative2();
                break;
            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }
}
