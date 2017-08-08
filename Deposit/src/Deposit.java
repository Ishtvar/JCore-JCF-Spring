import java.util.Scanner;

import OwnLib.Java.OwnLib;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        float sum;
        System.out.println("Введите сумму вклада грн,коп");
        sum = OwnLib.FloatInput();

        float percent;
        System.out.println("Введите процент годовых");
        System.out.print("# ");
        percent = OwnLib.FloatInput();

        int term;
        System.out.println("Введите срок вклада (лет)");
        System.out.print("# ");
        term = OwnLib.IntInput();

        float AccruPerc;
        for (int i = 1; i <= term; i++) {
            AccruPerc = sum / 100 * percent;
            sum = (sum * 100 + AccruPerc * 100) / 100;

            System.out.printf("\nза %d-й год.\nНакопленная сумма: %.2f грн.\nНачисленные проценты: %.2f грн.\n", i, sum, AccruPerc);

        }

    }
}
