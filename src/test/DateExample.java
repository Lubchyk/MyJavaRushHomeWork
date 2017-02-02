package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by АНТ on 01.02.2017.
 */
public class DateExample {
    public static void main(String[] args) {
        isDateOdd("JANUARY 2 2020");
    }

/**рахує скільки днів пройшло від початку року до вказаного числа*/
    public static boolean isDateOdd(String date)
    {
        long msDay = 24 * 60 * 60 * 1000; // = число при діленні на яке отримуємо кількість днів

        Date yearEnd = new Date(date);

        long nextYaer = yearEnd.getYear(); // беремо потрібний нам рік
        int year = (int) nextYaer;

        Date yearBigan = new Date(date);
        yearBigan.setHours(0);
        yearBigan.setMinutes(0); // встановлення часу вручну
        yearBigan.setSeconds(0);
        yearBigan.setDate(0);
        yearBigan.setMonth(0);
        yearBigan.setYear(year);

        long year1End = yearEnd.getTime(); //бере час початку року
        long year1Bigan = yearBigan.getTime(); //бере час вказаної дати
        long period = year1End - year1Bigan; // отримуємо правильний період
        int dayCount = ((int) (period / msDay)); // вираховує скільки днів в періоді
        System.out.println(dayCount);
        return true;
    }
    /**показує дату у вказаному форматі, але дата свого формату не міняє*/
    public void dateformat(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.US);//вказання фомату і локалізацію
        Date date1 = new Date(date);
        System.out.println(simpleDateFormat.format(date1));
    }

}
