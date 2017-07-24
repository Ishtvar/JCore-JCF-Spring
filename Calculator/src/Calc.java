import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        System.out.print("# ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число число");
        System.out.print("# ");
        int b = scanner.nextInt();
        System.out.println("Введите тип операции");
        System.out.print("# ");
        char oper =scanner.next().charAt(0);
        switch (oper) {
            case '+':
                System.out.print("Ответ: " + (a + b));
                break;
            case '-':
                System.out.print("Ответ: " + (a - b));
                break;
            case '*':
                System.out.print("Ответ: " + (a * b));
                break;
            case '/':
                System.out.print("Ответ: " + (a / b));
                break;
            case '%':
                System.out.print("Ответ: " + (a % b));
                break;
            default:
                System.out.print("Вы ввели недопустимый тип опрерации");
                break;
        }







    }
}
