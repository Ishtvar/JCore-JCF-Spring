import OwnLib.Java.OwnLib;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки");
        System.out.print("# ");
        int num = OwnLib.IntInput();
        String b = String.valueOf(num);
        char[] arr = b.toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if (arr[i] == arr[j]) {
                if (i >= j) {
                    System.out.println("Введённое число - палиндром");
                    break;
                }
            } else {
                System.out.println("Введённое число - не палиндром");
                break;
            }

        }
    }
}
