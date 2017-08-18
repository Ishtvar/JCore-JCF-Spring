package OwnLib.Java;

import java.util.Scanner;

public class OwnLib {
    public static int IntInput() {
        Scanner scanner = new Scanner(System.in);
        String wrongInput = new String();
        int rightInput;
        if (scanner.hasNextInt()) {
            rightInput = scanner.nextInt();
        } else {
            do {
                System.out.println("Вы ввели не верные данные");
                System.out.println("повторите ввод");
                System.out.print("# ");
                wrongInput = scanner.next();
            }
            while (!scanner.hasNextInt());
            rightInput = scanner.nextInt();
        }
        return (rightInput);
    }

    public static Float FloatInput() {
        Scanner scanner = new Scanner(System.in);
        String wrongInput = new String();
        float rightInput;
        if (scanner.hasNextFloat()) {

            rightInput = scanner.nextFloat();
        } else {
            do {
                System.out.println("Вы ввели не верные данные");
                System.out.println("повторите ввод");
                System.out.print("# ");
                wrongInput = scanner.next();
            }
            while (!scanner.hasNextFloat());
            rightInput = scanner.nextFloat();

        }
        return (rightInput);
    }

    public static double DoubleInput() {
        Scanner scanner = new Scanner(System.in);
        String wrongInput = new String();
        double rightInput;
        if (scanner.hasNextDouble()) {

            rightInput = scanner.nextDouble();
        } else {
            do {
                System.out.println("Вы ввели не верные данные");
                System.out.println("повторите ввод");
                System.out.print("# ");
                wrongInput = scanner.next();
            }
            while (!scanner.hasNextDouble());
            rightInput = scanner.nextDouble();

        }
        return (rightInput);
    }
    public static void ractangle(char[][] fig1, int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    fig1[i][j] = '*';
                else
                    fig1[i][j] = ' ';
            }
        }
    }

    public static void twoDimArrayOutput(char[][] arr, int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
