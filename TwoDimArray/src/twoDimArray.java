import OwnLib.Java.OwnLib;

import java.util.Arrays;

public class twoDimArray {
    public static void main(String[] args) {
        int w = 10;
        int h = 10;
        int quantity = w + h;
        int[][] arr = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                arr[i][j] = (int) (Math.random() * 42 - 21);
            }
        }
        OwnLib.twoDimArrayOutput(arr, h, w);

        int sum = getSum(arr, h, w);
        System.out.println("Сумма всех элементов массива = " + sum);

        double average = getAverage(sum, quantity);
        System.out.println("среднее арифметическое = " + average);

        int min = getMin(arr, h, w);
        System.out.println("минимальный элемен массива = " + min);

        int max = getMax(arr, h, w);
        System.out.println("максимальный элемент мвссива = " + max);

        int pos = getPositiveQuality(arr, h, w);
        System.out.println("количество положительных элементов = " + pos);

        String strSum = getStrSumm(arr, h, w);
        System.out.println("построчная сумма элементов  = " + strSum);
    }

    private static String getStrSumm(int[][] arr, int h, int w) {
        int[] str = new int[h];
        int sum = 0;
        for (int i = 0; i < h; i++, sum = 0) {
            for (int j = 0; j < w; j++) {
                sum += arr[i][j];
            }
            str[i] = sum;
        }
        String strSum = Arrays.toString(str);
        return (strSum);
    }

    private static int getPositiveQuality(int[][] arr, int h, int w) {
        int pos = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] >= 0) {
                    pos += 1;
                }
            }
        }
        return (pos);
    }


    private static int getMax(int[][] arr, int h, int w) {
        int max = arr[0][0];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    private static int getMin(int[][] arr, int h, int w) {
        int min = arr[0][0];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    private static double getAverage(int s, int q) {
        double a;
        a = (double) s / q;
        if (a < 0)
            a *= -1;
        return (a);
    }

    private static int getSum(int[][] arr, int h, int w) {
        int s = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                s += arr[i][j];
            }
        }
        return (s);
    }
}
