import java.util.Scanner;

import OwnLib.Java.OwnLib;

public class Drowings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();

        int width;
        System.out.println("Введите ширину фигур");
        System.out.print("# ");
        width = OwnLib.IntInput();

        int height;
        System.out.println("Введите высоту фигур");
        System.out.print("# ");
        height = OwnLib.IntInput();

        char[][] fig1 = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    fig1[i][j] = '*';
                else
                    fig1[i][j] = ' ';
            }
        }
        OwnLib.twoDimArrayOutput(fig1, height, width);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1 || i == j * height / width || j + i * width / height == width - 1)
                    fig1[i][j] = '*';
                else
                    fig1[i][j] = ' ';
            }
        }
        OwnLib.twoDimArrayOutput(fig1, height, width);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i % 2 == 1 && j % 2 == 1 || i % 2 == 0 && j % 2 == 0)
                    fig1[i][j] = ' ';
                else
                    fig1[i][j] = '*';
            }
        }
        OwnLib.twoDimArrayOutput(fig1, height, width);

    }
}
