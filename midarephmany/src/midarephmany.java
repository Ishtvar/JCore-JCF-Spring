import java.util.Scanner;

import OwnLib.Java.OwnLib;

public class midarephmany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        int a;
        System.out.println("Введите кол-во чисел");
        System.out.print("# ");
        a = OwnLib.IntInput();

        if (a != 0) {
            int c;
            System.out.println("Введите первое число");
            System.out.print("# ");
            c = OwnLib.IntInput();

            int b;
            for (int i = (a - 1); i > 0; i--, c += b) {
                System.out.println("Введите следующее число");
                System.out.print("# ");
                b = OwnLib.IntInput();
            }
            System.out.println("Ответ");
            System.out.print("# ");
            float d = (float) c / a;
            System.out.println(d);
        } else {
            System.out.println("Ответ");
            System.out.print("# 0");
        }
    }
}
