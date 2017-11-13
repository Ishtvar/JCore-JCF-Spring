import java.util.Arrays;

import OwnLib.Java.OwnLib;

public class NumOfDays {
    public static void main(String[] args) {
        int year, month;
        System.out.print("Введите год: ");
        year = OwnLib.IntInput();
        System.out.print("Введите месяц: ");
        month = OwnLib.IntInput();
        while (month <= 0 || month > 12) {
            System.out.println("В ввели не верный месяц, их всего 12!");
            System.out.println("Повторите ввод, пожалуйста");
            System.out.print("Введите месяц: ");
            month = OwnLib.IntInput();
        }

        printDays(year, month);

    }

    static void printDays(int year, int month) {
        Months[] months = Months.values();
        if (year % 4 != 0 || month != 2) {
            System.out.println(months[month - 1] + " " + year + " and " + months[month - 1].getDays() + " days");
        } else {
            System.out.println(months[month - 1] + " " + year + " and " + Months.hFebruary.getDays() + " days");
        }
    }
}
