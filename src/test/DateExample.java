package test;

import java.util.Date;

/**
 * Created by АНТ on 01.02.2017.
 */
public class DateExample {
    public static void main(String[] args) {
        isDateOdd("JANUARY 2 2020");
    }

    public static boolean isDateOdd(String date) {
        long msDay = 24 * 60 * 60 * 1000;

        Date yearBigan = new Date(date);

        long nextYaer = yearBigan.getYear();
        int year = (int) nextYaer;

        Date yearEnd = new Date(date);
        yearEnd.setHours(0);
        yearEnd.setMinutes(0);
        yearEnd.setSeconds(0);
        yearEnd.setDate(0);
        yearEnd.setMonth(0);
        yearEnd.setYear(year);

        long year1 = yearBigan.getTime();
        long year2 = yearEnd.getTime();
        long period = year1 - year2;

        int dayCount = ((int) (period / msDay));

        System.out.println(dayCount);
        boolean resalt = update(dayCount);
        System.out.println(resalt);
        return resalt;
    }
    static boolean update(int a) {
        int b = a % 2;
        if (b == 1) return true;
        else return false;
    }
}
