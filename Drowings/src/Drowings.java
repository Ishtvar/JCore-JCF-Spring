import java.util.Scanner;

public class Drowings {

    // не доделана

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        int width;
        System.out.println("Введите первое число");
        System.out.print("# ");
        if (scanner.hasNextInt()) {
            width = scanner.nextInt();
        } else {
            do {
                System.out.println("Вы ввели не верное число");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextInt());
            width = scanner.nextInt();
        }
        int height;
        System.out.println("Введите первое число");
        System.out.print("# ");
        if (scanner.hasNextInt()) {
            height = scanner.nextInt();
        } else {
            do {
                System.out.println("Вы ввели не верное число");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextInt());
            height = scanner.nextInt();
        }
        char[][] fig1 = new char[height][width];
        for (int i = 0; i < height ; i++) {
            for (int j = 0; j < width; j++) {
                fig1[i][j] = '*';
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(fig1[i][j]);
            }
            System.out.println();
        }


    }
}
