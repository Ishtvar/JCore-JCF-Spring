import OwnLib.Java.OwnLib;

public class SwapOfTwoColumns {
    public static void main(String[] args) {
        int h = 4;
        int w = 4;
                int[][] arr = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }

        }
        OwnLib.twoDimArrayOutput(arr, 4, 4);
        OwnLib.columnSwap(arr, 1, 2);
        System.out.println();
        OwnLib.twoDimArrayOutput(arr, 4, 4);
    }
}
