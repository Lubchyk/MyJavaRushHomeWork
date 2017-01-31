package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1[] = s.split("\\s+"); // розбиває строку на декілька
        String bk1 = s1[0].substring(0, 1); // копіює вказаний символ із строки
        String bk2 = s1[1].substring(0, 1); // копіює вказаний символ із строки
        String bk3 = s1[2].substring(0, 1); // копіює вказаний символ із строки
        String sl1 = s1[0].substring(1, s1[0].length());
        String sl2 = s1[1].substring(1, s1[1].length());
        String sl3 = s1[2].substring(1, s1[2].length());
        bk1 = bk1.toUpperCase();
        bk2 = bk2.toUpperCase();
        bk3 = bk3.toUpperCase();
        System.out.println(bk1 + sl1 + " " + bk2 + sl2 + " " + bk3 + sl3);
    }
}
