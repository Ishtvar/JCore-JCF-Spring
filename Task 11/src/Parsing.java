import OwnLib.Java.OwnLib;

import java.util.Scanner;

public class Parsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;
        double weight;
        System.out.println("Выбирите тип разбивки и еденицы измерения:\n1 - в граммах\n2 - на свой выбор");
        System.out.print("# ");
        choise = OwnLib.IntInput();
        while (choise != 1 && choise != 2) {
            System.out.println("не верный выбор\nПовторите ввод (1) или (2)");
            System.out.print("# ");
            choise = OwnLib.IntInput();
        }
        if (choise == 1) {
            System.out.println("Введите число в граммах");
            System.out.print("# ");
            weight = OwnLib.DoubleInput();
            getParced(weight);
        } else {
            System.out.println("Введите еденицы езмерения");
            System.out.print("# ");
            char mesure = scanner.next().charAt(0);
            while (mesure != 't' && mesure != 'k' && mesure != 'g' && mesure != 'm') {
                System.out.println("Вы ввели не верные единицы измерения");
                System.out.println("Повторно введите единицы измерения (tones, kilograms, grams, micrograms)");
                System.out.print("# ");
                mesure = scanner.next().charAt(0);
            }
            System.out.println("Введите число");
            System.out.print("# ");
            weight = OwnLib.DoubleInput();
            switch (mesure) {
                case ('t'):
                    weight = weight * 1000000;
                    getParced(weight);
                    break;
                case ('k'):
                    weight = weight * 1000;
                    getParced(weight);
                    break;
                case ('g'):
                    getParced(weight);
                    break;
                case ('m'):
                    weight = weight / 1000;
                    getParced(weight);
                    break;
            }
        }
    }

    private static void getParced(double weight) {
        int tones, kg, g, mg;
        String parcedWeight;
        parcedWeight = "";
        tones = (int) weight / 1000000;
        if (tones != 0) {
            parcedWeight = String.valueOf(tones) + " tones ";
        }
        weight -= tones * 1000000;

        kg = (int) weight / 1000;
        if (kg != 0) {
            parcedWeight += String.valueOf(kg) + " kilograms ";
        }
        weight -= kg * 1000;

        g = (int) weight;
        if (g != 0) {
            parcedWeight += String.valueOf(g) + " grams ";
        }
        weight -= g;

        mg = (int) (weight * 1000);
        if (mg != 0) {
            parcedWeight += String.valueOf(mg) + " micrograms";
        }
        System.out.println(parcedWeight);
    }
}
