import OwnLib.Java.OwnLib;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = new String();

        int a;
        System.out.println("Введите первое число");
        System.out.print("# ");
        a = OwnLib.IntInput();

        int b;
        System.out.println("Введите второе число");
        System.out.print("# ");
        b = OwnLib.IntInput();

        char oper;
        System.out.println("Введите тип операции");
        System.out.print("# ");
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
                    if (b == 0)
                        System.out.print("На ноль делить нельзя!");
                    else
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
