import OwnLib.Java.OwnLib;

public class Parity {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число");
        System.out.print("# ");
        a = OwnLib.IntInput();
        if (a % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели не чётное число");
        }
    }
}
