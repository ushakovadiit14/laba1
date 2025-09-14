import java.util.Scanner;
import java.util.Random;

public class methods {

    // Задание 1. Методы
    /*
    Задание 2
    Сумма знаков.
Дана сигнатура метода: public int sumLastNums (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал результат
сложения двух последних знаков числах, предполагая, что знаков в числе не
менее двух. Подсказки:
int x=123%10; // х будет иметь значение 3
int у=123/10; // у будет иметь значение 12
Пример:
x=4568
результат: 14
     */
    public static int sumLastNums(int x) {
        return (x % 10) + ((x / 10) % 10);
    }

    public static void sumLastNums2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число (не менее 2 цифр): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int number = scanner.nextInt();

        if (Math.abs(number) < 10) {
            System.out.println("Ошибка! Число должно содержать не менее 2 цифр.");
        } else {
            int result = sumLastNums(number);
            System.out.println("Сумма двух последних цифр числа " + number + " = " + result);
        }
        scanner.close();
    }

    /* Задание 4
    Есть ли позитив.
Дана сигнатура метода: public bool isPositive (int x);
Необходимо реализовать метод таким образом, чтобы он принимал число x и
возвращал true, если оно положительное.
Пример 1:
x=3
результат: true
Пример 2:
x=-5
результат: false
     */
    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static void isPositive2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int number = scanner.nextInt();

        boolean result = isPositive(number);
        System.out.println("Число " + number + ": " + result);
        scanner.close();
    }

    /* Задание 6
Большая буква.
Дана сигнатура метода: public bool isUpperCase (char x);
Необходимо реализовать метод таким образом, чтобы он принимал символ x и
возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’
.
Пример 1:
x=
’D’
результат: true
Пример 2:
x=
’q’
результат: false
     */
    public static boolean isUpperCase(char x) {
        return Character.isUpperCase(x);
    }

    public static void isUpperCase2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        char bykva = scanner.next().charAt(0);

        boolean result = isUpperCase(bykva);
        System.out.println("Буква '" + bykva + "': " + result);
        scanner.close();
    }

     /* Задание 8
Делитель.
Дана сигнатура метода: public bool isDivisor (int a, int b);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если
любое из принятых чисел делит другое нацело.
Пример 1:
a=3 b=6
результат: true
Пример 2:
a=2 b=15
результат: false
      */
    public static boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static void isDivisor2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число a: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число b: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int b = scanner.nextInt();

        boolean result = isDivisor(a, b);
        System.out.println("Одно число делит другое: " + result);
        scanner.close();
    }

     /* Задание 10
Дана сигнатура метода: public int lastNumSum(int a, int b)
Необходимо реализовать метод таким образом, чтобы он считал сумму цифр
двух чисел из разряда единиц. Выполните с его помощью последовательное
сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить
задачу, используя минимально возможное количество вспомогательных
переменных.
Пример:
5+11 это 6
6+123 это 9
9+14 это 13
13+1 это 4
Итого 4
      */
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    public static void lastNumSum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число a: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число b: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int b = scanner.nextInt();

        int result = lastNumSum(a, b);
        System.out.println("Сумма последних цифр: " + result);
        scanner.close();
    }
//Задание 2. Условия
     /* Задание 2
Безопасное деление.
Дана сигнатура метода: public double safeDiv (int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал деление x
на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При
делении на 0 следует вернуть из метода число 0. Подсказка: смотри
ограничения на операции типов данных.
Пример 1:
x=5 y=0
результат: 0
Пример 2:
x=8 y=2
результат: 4
      */
    public static double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    public static void safeDiv2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число x: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();
        System.out.print("Введите число y: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число y: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int y = scanner.nextInt();

        double result = safeDiv(x, y);
        System.out.println("x / y = " + result);
        scanner.close();
    }

     /* Задание 4
Строка сравнения.
Дана сигнатура метода: public String makeDecision (int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал строку,
которая включает два принятых методом числа и корректно выставленный
знак операции сравнения (больше, меньше, или равно).
Пример 1:
x=5 y=7
результат: “5< 7”
Пример 2:
x=8 y=-1
результат: “8 >-1”
Пример 3:
x=4 y=4
результат: “4==4”
      */
    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    public static void makeDecision2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число x: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();
        System.out.print("Введите число y: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число y: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int y = scanner.nextInt();

        String result = makeDecision(x, y);
        System.out.println(result);
        scanner.close();
    }

     /* Задание 6
Тройная сумма.
Дана сигнатура метода: public bool sum3 (int x, int y, int z);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если
два любых числа (из трех принятых) можно сложить так, чтобы получить
третье.
Пример 1:
x=5 y=7 z=2
результат: true
Пример 2:
x=8 y=-1 z=4
результат: false
      */
    public static boolean sum3(int x, int y, int z) {
        if( x + y == z || x + z == y || y + z == x) {
            return true;
        }else{
            return false;
        }

    }

    public static void sum32() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число x: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();
        System.out.print("Введите число y: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число y: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int y = scanner.nextInt();
        System.out.print("Введите число z: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число z: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int z = scanner.nextInt();

        boolean result = sum3(x, y, z);
        System.out.println("Два числа дают третье: " + result);
        scanner.close();
    }

    /* Задание 8
Возраст.
Дана сигнатура метода: public String age (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
которой сначала будет число х, а затем одно из слов:
год
года
лет
Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
12, 13, 14.
Слово “лет”добавляется во всех остальных случаях.
Подсказка: оператор % позволяет получить остаток от деления.
Пример 1:
x=5
результат: “5 лет”
Пример 2:
x=31
результат: “31 год”
Пример 3:
x=44
результат: “44 года”
     */
    public static String age(int x) {
        if (x % 10 == 1) {
            return x + " год";
        } else if (x % 10 >= 2 && x % 10 <= 4 ) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public static void age2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите возраст: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();

        String result = age(x);
        System.out.println(result);
        scanner.close();
    }

    /* Задание 10
Вывод дней недели.
Дана сигнатура метода: public void printDays (String x);
В качестве параметра метод принимает строку, в которой записано название
дня недели. Необходимо реализовать метод таким образом, чтобы он выводил
на экран название переданного в него дня и всех последующих до конца недели
дней. Если в качестве строки передан не день, то выводится текст “это не день
недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной
задаче используйте switch.
Пример 1:
x=
”четверг”
результат:
четверг
пятница
суббота
воскресенье
Пример 2:
x=
”чг”
результат:
это не день недели
     */
    public static void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник\nвторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "вторник":
                System.out.println("вторник\nсреда\nчетверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "среда":
                System.out.println("среда\nчетверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "четверг":
                System.out.println("четверг\nпятница\nсуббота\nвоскресенье");
                break;
            case "пятница":
                System.out.println("пятница\nсуббота\nвоскресенье");
                break;
            case "суббота":
                System.out.println("суббота\nвоскресенье");
                break;
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    public static void printDays2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String x = scanner.nextLine();

        printDays(x);
        scanner.close();
    }


//Задание 3. Циклы
    /* Задание 2
Числа наоборот.
Дана сигнатура метода: public String reverseListNums (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
которой будут записаны все числа от x до 0 (включительно).
Пример:
x=5
результат: “5 4 3 2 1 0”
     */
    public static String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public static void reverseListNums2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();

        String result = reverseListNums(x);
        System.out.println(result);
        scanner.close();
    }

    /* Задание 4
Степень числа.
Дана сигнатура метода: public int pow (int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал результат
возведения x в степень y.
Подсказка: для получения степени необходимо умножить единицу на число x, и
сделать это y раз, т.е. два в третьей степени это 1*2*2*2
Пример:
x=2
y=5
результат: 32
     */
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void pow2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();
        System.out.print("Введите степень: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите степень: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int y = scanner.nextInt();

        int result = pow(x, y);
        System.out.println(x + " в степени " + y + " = " + result);
        scanner.close();
    }

    /* Задание 6
Одинаковость.
Дана сигнатура метода: public bool equalNum (int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если
все знаки числа одинаковы, и false в ином случае.
Подсказки:
intx=123%10; // х будет иметь значение 3
intу=123/10; // у будет иметь значение 12
Пример 1:
x=1111
результат: true
Пример 2:
x=1211
результат: false
     */
    public static boolean equalNum(int x) {
        if (x < 0) x = -x; //делаем число положительным
        if (x < 10) return true;

        int lastDigit = x % 10;
        x = x / 10;

        while (x > 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    public static void equalNum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();

        System.out.println("Все цифры одинаковы: " + equalNum(x));
        scanner.close();
    }

    /* Задание 8
Левый треугольник.
Дана сигнатура метода: public void leftTriangle (int x);
Необходимо реализовать метод таким образом, чтобы он выводил на экран
треугольник из символов ‘*’ у которого х символов в высоту, а количество
символов в ряду совпадает с номером строки.
Пример 1:
x=2
результат:
*
**
Пример 2:
x=4
результат:
*
**
***
****
     */
    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void leftTriangle2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите высоту треугольника: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();

        leftTriangle(x);
        scanner.close();
    }

    /* Задание 10
Угадайка.
Дана сигнатура метода: public void guessGame()
Необходимо реализовать метод таким образом, чтобы он генерировал
случайное число от 0 до 9, далее считывал с консоли введенное пользователем
число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод
запускается до тех пор, пока пользователь не угадает число. После этого
выведите на экран количество попыток, которое потребовалось пользователю,
чтобы угадать число.
Пример:
Введите число от 0 до 9:
5
Вы не угадали, введите число от 0 до 9:
9
Вы угадали!
Вы отгадали число за 2 попытки
     */
    public static void guessGame() {
        Random rand = new Random();
        int randomInt = rand.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите цифры, а не текст.");
                System.out.print("Введите высоту треугольника: ");
                scanner.next(); // очищаем неправильный ввод
            }
            int guess = scanner.nextInt();
            if( guess < 0 || guess > 9){
                System.out.println("Ошибка! Введите цифры от 0 до 9");
                System.out.print("Введите высоту треугольника: ");
                scanner.next(); // очищаем неправильный ввод
            }
            attempts++;

            if (guess == randomInt) {
                System.out.println("Вы угадали!");
                System.out.println("Вы отгадали число за " + attempts + " попытки");
                break;
            } else {
                System.out.println("Вы не угадали");
            }
        }
        scanner.close();
    }

    public static void guessGame2() {
        guessGame();
    }


//Задание 4. Массивы
    /* Задание 2
Поиск последнего значения.
Дана сигнатура метода: public int findLast (int[] arr, int x);
Необходимо реализовать метод таким образом, чтобы он возвращал индекс
последнего вхождения числа x в массив arr. Если число не входит в массив –
возвращается -1.
Пример:
arr=[1,2,3,4,2,2,5]
x=2
результат: 5
     */
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void findLast2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите размер массива: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите " + i + " число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите цифры, а не текст.");
                System.out.print("Введите " + i + " число: ");
                scanner.next(); // очищаем неправильный ввод
            }
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введите число для поиска: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число для поиска: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();

        int result = findLast(arr, x);
        System.out.println("Индекс последнего вхождения: " + result);
        scanner.close();
    }

    /* Задание 4
Добавление в массив.
Дана сигнатура метода: public int[]add (int[] arr, int x, int pos);
Необходимо реализовать метод таким образом, чтобы он возвращал новый
массив, который будет содержать все элементы массива arr, однако в позицию
pos будет вставлено значение x.
Пример:
arr=[1,2,3,4,5]
x=9
pos=3
результат: [1,2,3,9,4,5]
     */
    public static int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Ошибка: неверная позиция!");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, pos);
        newArr[pos] = x;
        System.arraycopy(arr, pos, newArr, pos + 1, arr.length - pos);

        return newArr;
    }

    public static void add2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите размер массива: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент [" + i + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите цифры, а не текст.");
                System.out.print("Введите элемент [" + i + "]: ");
                scanner.next(); // очищаем неправильный ввод
            }
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введите число для вставки: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите число для вставки: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int x = scanner.nextInt();
        System.out.print("Введите позицию вставки: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите позицию вставки: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int pos = scanner.nextInt();

        int[] result = add(arr, x, pos);

        System.out.print("Результат: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        scanner.close();
    }

    /* Задание 6
Реверс.
Дана сигнатура метода: public void reverse (int[] arr);
Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
После проведенных изменений массив должен быть записан задом-наперед.
Пример:
arr=[1,2,3,4,5]
результат: arr=[5,4,3,2,1]
     */

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void reverse2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите размер массива: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент [" + i + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите цифры, а не текст.");
                System.out.print("Введите элемент [" + i + "]: ");
                scanner.next(); // очищаем неправильный ввод
            }
            arr[i] = scanner.nextInt();
        }

        System.out.print("Исходный массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        reverse(arr);

        System.out.print("Перевернутый массив: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        scanner.close();
    }

    /* Задание 8
Объединение.
Дана сигнатура метода: public int[] concat (int[] arr1,int[] arr2);
Необходимо реализовать метод таким образом, чтобы он возвращал новый
массив, в котором сначала идут элементы первого массива (arr1), а затем
второго (arr2).
Пример:
arr1=[1,2,3]
arr2=[7,8,9]
результат: [1,2,3,7,8,9]
     */
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public static void concat2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер 1 массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите размер 1 массива: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Введите элемент 1 массива [" + i + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите цифры, а не текст.");
                System.out.print("Введите элемент 1 массива [" + i + "]: ");
                scanner.next(); // очищаем неправильный ввод
            }
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Введите размер 2 массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите размер 2 массива: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Введите элемент 2 массива [" + i + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите цифры, а не текст.");
                System.out.print("Введите элемент 2 массива [" + i + "]: ");
                scanner.next(); // очищаем неправильный ввод
            }
            arr2[i] = scanner.nextInt();
        }

        int[] result = concat(arr1, arr2);

        System.out.print("Объединенный массив: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        scanner.close();
    }

    /* Задание 10
Удалить негатив.
Дана сигнатура метода: public int[] deleteNegative (int[] arr);
Необходимо реализовать метод таким образом, чтобы он возвращал новый
массив, в котором записаны все элементы массива arr кроме отрицательных.
Пример:
arr=[1,2,-3,4,-2,2,-5]
результат: [1,2,4,2]
     */
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index++] = num;
            }
        }
        return result;
    }

    public static void deleteNegative2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите цифры, а не текст.");
            System.out.print("Введите размер массива: ");
            scanner.next(); // очищаем неправильный ввод
        }
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент [" + i + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите цифры, а не текст.");
                System.out.print("Введите элемент [" + i + "]: ");
                scanner.next(); // очищаем неправильный ввод
            }
            arr[i] = scanner.nextInt();
        }

        int[] result = deleteNegative(arr);

        System.out.print("Массив без отрицательных: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        scanner.close();
    }
}
