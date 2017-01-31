package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года -
нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {
        isDateOdd("JANUARY 1 2013");

        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
       // System.out.println("Days from start of year: " + dayCount);

    }

    public static boolean isDateOdd(String date) {
        long c =  31622400000L ;
        Date oneYear = new Date();
        oneYear.setTime(c);

//        long f = date11.getTime() - date22.getTime();
//        long a = date11.getTime();
//        long b = date22.getTime();
        int p = 147 - (2^13) + 2^17 + 4625*8 + 262;


        Date yearBigan = new Date(date);



        Date year = new Date();
        year.setHours(0);
        year.setMinutes(0);
        year.setSeconds(0);
        year.setDate(1);
        year.setMonth(0);
        year.setYear(1);

        long year1 = yearBigan.getYear();
        year1 = year1 + c;
        //long g =
        long msDay = 24 * 60 * 60 * 1000;
        //long date18 = yearBigan.getTime();
       int dayCount = (int) (year1 / msDay);
        System.out.println(p);


        return true;
    }
}
