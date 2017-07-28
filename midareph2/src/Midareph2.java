import java.util.Scanner;

public class Midareph2 {

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
        float c = (float) (a + b) / 2;
        System.out.println("Среднее арифметическое двух чисел равно:");
        System.out.print("# ");
        System.out.println(c);

    }
}
