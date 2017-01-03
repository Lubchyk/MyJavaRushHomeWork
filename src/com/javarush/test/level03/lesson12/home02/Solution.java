package com.javarush.test.level03.lesson12.home02;

/* Я не хочу изучать Java, я хочу большую зарплату
Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println("Я не хочу изучать Java, я хочу большую зарплату");
//            i++;
//        }
//        while (i < 10);

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int a = 0;
        switch (day) {
            case 1 :
                System.out.print("понедельник");
                a++;
                break;
            case 2 :
                System.out.print("вторник");
                a++;
                break;
            case 3 :
                System.out.print("среда");
                a++;
                break;
            case 4 :
                System.out.print("четверг");
                a++;
                break;
            case 5 :
                System.out.print("пятница");
                a++;
                break;
            case 6 :
                System.out.print("суббота");
                a++;
                break;
            case 7 :
                System.out.print("воскресенье");
                a++;
                break;
                    }
        if(a <= 0 || a > 7) System.out.print("такого дня недели не существует");
        //if(a > 0 && a <= 2 || a == 2) System.out.print("такого дня недели не существует");

    }

}
