import OwnLib.Java.OwnLib;

import java.util.Arrays;

public class arrayColumn {
    public static void main(String[] args) {
        int h = (int) (Math.random() * 10);
        int w = h;
        int[][] arr = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        int[] arr1 = new int[h];

        for (int i = 0; i < h; i++) {
            arr1[i] = 0;
            for (int j = 0; j < w; j++) {
                arr1[i] += arr[j][i];
            }
        }

        int max = arr1[0];

        for (int i = 0; i < h; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        int maxCol = 0;

        for (int i = 0; i < h; i++) {
            if (max == arr1[i]) {
                maxCol = i;
            }
        }

        OwnLib.twoDimArrayOutput(arr, h, w);
        System.out.println("Сумма элементов в каждм столбце" + Arrays.toString(arr1));
        System.out.println("Столбец с наиюольшей суммой = " + (maxCol + 1));
    }
}
