import OwnLib.Java.OwnLib;

import java.util.Scanner;

public class parcing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise, tones, kg, g, mg;
        double weight;
        String parcedWeight;
        parcedWeight = "";
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

            tones = (int) weight / 1000000;
            parcedWeight = String.valueOf(tones) + " tones ";
            weight -= tones * 1000000;

            kg = (int) weight / 1000;
            parcedWeight += String.valueOf(kg) + " kilograms ";
            weight -= kg * 1000;

            g = (int) weight;
            parcedWeight += String.valueOf(g) + " grams ";
            weight -= g;

            mg = (int) (weight * 1000);
            parcedWeight += String.valueOf(mg) + " micrograms";

            System.out.println(parcedWeight);
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

                    tones = (int) weight;
                    if (tones > 0) {
                        parcedWeight = String.valueOf(tones) + " tones ";
                        weight -= tones;
                    }
                    kg = (int) (weight * 1000);
                    if (kg > 0) {
                        parcedWeight += String.valueOf(kg) + " kilograms ";
                        weight -= kg / 1000;
                    }
                    g = (int) (weight * 1000000);
                    if (g > 0) {
                        parcedWeight += String.valueOf(g) + " grams ";
                        weight -= g / 1000000;
                    }
                    mg = (int) (weight * 1000000000);
                    if (mg > 0) {
                        parcedWeight += String.valueOf(mg) + " micrograms";
                    }
                    System.out.println(parcedWeight);
                    break;

                case ('k'):
                    tones = (int) weight / 1000;
                    if (tones > 0) {
                        parcedWeight = String.valueOf(tones) + " tones ";
                        weight -= tones * 1000;
                    }
                    kg = (int) weight;
                    if (kg > 0) {
                        parcedWeight += String.valueOf(kg) + " kilograms ";
                        weight -= kg;
                    }
                    g = (int) (weight * 1000);
                    if (g > 0) {
                        parcedWeight += String.valueOf(g) + " grams ";
                        weight -= g / 1000;
                    }
                    mg = (int) (weight * 1000000);
                    if (mg > 0) {
                        parcedWeight += String.valueOf(mg) + " micrograms";
                    }
                    System.out.println(parcedWeight);
                    break;
                case ('g'):
                    tones = (int) weight / 1000000;
                    if (tones > 0) {
                        parcedWeight = String.valueOf(tones) + " tones ";
                        weight -= tones * 1000000;
                    }
                    kg = (int) weight / 1000;
                    if (kg > 0) {
                        parcedWeight += String.valueOf(kg) + " kilograms ";
                        weight -= kg * 1000;
                    }
                    g = (int) weight;
                    if (g > 0) {
                        parcedWeight += String.valueOf(g) + " grams ";
                        weight -= g;
                    }
                    mg = (int) (weight * 1000);
                    if (mg > 0) {
                        parcedWeight += String.valueOf(mg) + " micrograms";
                    }
                    System.out.println(parcedWeight);
                    break;
                case ('m'):
                    tones = (int) weight / 1000000000;
                    if (tones > 0) {
                        parcedWeight = String.valueOf(tones) + " tones ";
                        weight -= tones * 1000000000;
                    }
                    kg = (int) weight / 1000000;
                    if (kg > 0) {
                        parcedWeight += String.valueOf(kg) + " kilograms ";
                        weight -= kg * 1000000;
                    }
                    g = (int) weight / 1000;
                    if (g > 0) {
                        parcedWeight += String.valueOf(g) + " grams ";
                        weight -= g * 1000;
                    }
                    mg = (int) weight;
                    if (mg > 0) {
                        parcedWeight += String.valueOf(mg) + " micrograms ";
                    }
                    System.out.println(parcedWeight);
                    break;


            }
        }
    }
}
