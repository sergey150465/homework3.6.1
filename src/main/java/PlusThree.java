import java.util.Scanner;

public class PlusThree {
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа расчета суммы трех чисел");
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scanner.nextInt();
        System.out.println("Сумма чисел равна: " + sum(number1, number2, number3));
    }

}
