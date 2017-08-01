import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        float sum;
        System.out.println("Введите сумму вклада грн,коп");
        System.out.print("# ");
        if (scanner.hasNextFloat()) {
            sum = scanner.nextFloat();
        } else {
            do {
                System.out.println("Вы ввели не верную сумму");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextFloat());
            sum = scanner.nextFloat();
        }
        float percent;
        System.out.println("Введите процент годовых");
        System.out.print("# ");
        if (scanner.hasNextFloat()) {
            percent = scanner.nextFloat();
        } else {
            do {
                System.out.println("Вы ввели не верный процент");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextFloat());
            percent = scanner.nextFloat();
        }
        int term;
        System.out.println("Введите срок вклада (лет)");
        System.out.print("# ");
        if (scanner.hasNextInt()) {
            term = scanner.nextInt();
        } else {
            do {
                System.out.println("Вы ввели не верный срок");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextInt());
            term = scanner.nextInt();
        }
        float AccruPerc;
        for (int i = 1; i <= term; i++) {
            AccruPerc = sum / 100 * percent;
            sum = (sum * 100 + AccruPerc * 100) / 100;

            System.out.printf("\nза %d-й год.\nНакопленная сумма: %.2f грн.\nНачисленные проценты: %.2f грн.\n", i, sum, AccruPerc);

        }

    }
}
