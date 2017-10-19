import OwnLib.Java.OwnLib;

public class primeNumber {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число");
        System.out.print("# ");
        a = OwnLib.IntInput();
        if (a > 0) {
            for (int i = a - 1; i > 0; i--) {
                if (a % i != 0) {
                    continue;
                } else {
                    if (i == 1) {
                        System.out.println("Вы ввели простое число");
                    } else {
                        System.out.println("Это число не такое уж и простое");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Это число совсем не простое");
        }
    }
}
