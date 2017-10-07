import OwnLib.Java.OwnLib;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[(int) (Math.random() * 20 + 1)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 31);

        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
        System.out.println(Arrays.toString(arr));

        binarySearch(arr);

        recursiveBinarySearch(arr);

    }

    private static void recursiveBinarySearch(int[] arr) {
        System.out.print("Введите ещё оди элемент для поиска: ");
        int s = OwnLib.IntInput();
        System.out.println();
        int start = 0, end = arr.length;
        recursiveBinarySearch(arr, start, end, s);

    }

    private static void recursiveBinarySearch(int[] arr, int start, int end, int s) {
        if (start >= end) {
            System.out.println("Искомый элемент отсутствует в массиве");
        } else {
            int mid = (start + end) / 2;
            if (s == arr[mid]) {
                System.out.println("Искомый элемент найден и находится на " + (mid + 1) + " позиции");
            } else {
                if (s < arr[mid]) {
                    end = mid;
                    recursiveBinarySearch(arr, start, end, s);
                } else {
                    start = mid + 1;
                    recursiveBinarySearch(arr, start, end, s);

                }
            }
        }

    }

    private static void binarySearch(int[] arr) {
        System.out.print("Введите искомый элемент: ");
        int s = OwnLib.IntInput();
        System.out.println();
        int start = 0, end = arr.length, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (s == arr[mid]) {
                System.out.println("Искомый элемент найден и находится на " + (mid + 1) + " позиции");
                break;
            } else {
                if (s < arr[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            if (start == end) {
                System.out.println("Искомый элемент отсутствует в массиве");
            }

        }

    }
}
