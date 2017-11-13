import java.util.Scanner;

import OwnLib.Java.OwnLib;

public class Average2 {

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

        float c = (float) (a + b) / 2;
        System.out.println("Среднее арифметическое двух чисел равно:");
        System.out.print("# ");
        System.out.println(c);

    }
}
