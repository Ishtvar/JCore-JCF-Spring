import java.util.Scanner;

public class midarephmany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        int a;
        System.out.println("Введите кол-во чисел");
        System.out.print("# ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            do {
                System.out.println("Вы ввели не кол-во чисел");
                System.out.println("повторите ввод");
                System.out.print("# ");
                input = scanner.next();
            }
            while (!scanner.hasNextInt());
            a = scanner.nextInt();
        }
        if (a != 0) {
            int c;
            System.out.println("Введите первое число число");
            System.out.print("# ");
            if (scanner.hasNextInt()) {
                c = scanner.nextInt();
            } else {
                do {
                    System.out.println("Вы ввели не верное число");
                    System.out.println("повторите ввод");
                    System.out.print("# ");
                    input = scanner.next();
                }
                while (!scanner.hasNextInt());
                c = scanner.nextInt();
            }
            int b;
            for (int i = (a - 1); i > 0; i--, c += b) {
                System.out.println("Введите следующее число");
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
            }
            System.out.println("Ответ");
            System.out.print("# ");
            float d = (float) c / a;
            System.out.println(d);
        }
        else {
            System.out.println("Ответ");
            System.out.print("# 0");
        }
    }
}
