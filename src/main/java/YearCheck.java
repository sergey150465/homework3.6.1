import java.util.Scanner;

public class YearCheck {

    public static int yearCheck(int a) {
        int result;
        if (a % 400 == 0) result = 366;
        else if (a % 100 == 0) result = 365;
        else if (a % 4 == 0) result = 366;
        else result = 365;
        return result;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.println("Введите год и количество дней в формате yyyy               число");
            int year = scaner.nextInt();
            int days = scaner.nextInt();
            if (yearCheck(year) == days) score++;
            else {
                System.out.println("Неправильно! В этом году " + yearCheck(year) + " дней!");
                System.out.println("Набрано очков: " + score);
                break;
            }
        }
    }
}

