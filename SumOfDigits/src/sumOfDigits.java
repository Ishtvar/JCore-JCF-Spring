import OwnLib.Java.OwnLib;

public class sumOfDigits {
    public static void main(String[] args) {
        int a, sum;
        System.out.println("Введите число, сумму цифр которого Вы хотите узнать");
        System.out.print("# ");
        a = OwnLib.IntInput();
        sum = getSum(a);
        System.out.println("Ответ");
        System.out.print("# " + sum);


    }

    private static int getSum(int num) {
        int sum = 0;
        int i = 10;
        while (num % i != 0 || num / i != 0) {
            sum += num % i;
            num /= i;
        }
        if (sum < 0) {
            sum *= -1;
        }

        return sum;
    }
}
