import java.time.LocalDate;

public class Main {
    public static void printSeparator() {
        System.out.println("--------------------");
    }
    public static void task1() {
        /*Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит
        результат в консоль.*/
        printSeparator();
        int year = 2100;
        printInfoAboutYear(year);
    }

    public static void printInfoAboutYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        /*Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android) и год выпуска
        устройства. Если устройство старше текущего года, предложите ему установить облегченную версию.
        Текущий год можно получить таким способом:
        int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную — ввести в переменную числовое значение.
        В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
        и для какой ОС (Android или iOS) установить пользователю.*/
        printSeparator();
        int deviceYear = 2022;
        int clientOS = 1;
        printInfoAboutClientVersion(deviceYear, clientOS);
    }

    public static void printInfoAboutClientVersion(int year, int os) {
        int osAndroid = 1;
        int osIOS = 0;
        int currentYear = LocalDate.now().getYear();

        if (os == osAndroid) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (os == osIOS) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task3() {
        /*Ваша задача — доработать код, а именно написать метод, который на вход
        принимает дистанцию и возвращает итоговое количество дней доставки.*/
        printSeparator();
        int deliveryDistance = 101;
        int deliveryDays = numDays(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Свыше 100 км доставки нет!");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    public static int numDays(int distance) {
        int days = 0;
        if (distance<20) {
            days++;
            return days;
        } else if (distance < 60) {
            days +=2;
            return days;
        } else if (distance <= 100) {
            days +=3;
            return days;
        }
        return days;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}