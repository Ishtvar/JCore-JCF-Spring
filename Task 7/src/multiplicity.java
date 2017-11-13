import OwnLib.Java.OwnLib;

public class multiplicity {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число");
        System.out.print("# ");
        a = OwnLib.IntInput();
        if (a < 0)
            a *= -1;
        System.out.println("Ваше число кротоно:");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
