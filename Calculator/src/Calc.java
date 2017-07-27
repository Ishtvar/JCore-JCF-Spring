import java.util.Scanner;

import static java.lang.Math.pow;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        int a;
        System.out.println("Введите первое число");
        System.out.print("# ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            do {
                System.out.println("Вы ввели не верное число");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextInt());
            a = scanner.nextInt();
        }

        int b;
        System.out.println("Введите второе число");
        System.out.print("# ");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            do {
                System.out.println("Вы ввели не верное число");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextInt());
            b = scanner.nextInt();
        }

        System.out.println("Введите тип операции");
        System.out.print("# ");

        char oper;
        do {
            oper = scanner.next().charAt(0);
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
                default:
                    System.out.println("Вы ввели недопустимый тип опрерации");
                    System.out.println("допустимые операции: +, -, *, /");
                    System.out.println("повторите ввод");
                    System.out.print("# ");
                    input = scanner.nextLine();
                    oper = 'x';
            }
        }
        while (oper == 'x');
    }

    }
