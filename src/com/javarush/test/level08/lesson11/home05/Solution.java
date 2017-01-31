package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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
        List<String> space = new ArrayList<String>();
        String a = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] != ' ') break;
                    a = a + " ";
                    i++;
                }
            }
            if (!a.equals("")) {
                space.add(a);
                a = "";
            }
        }
        s = s.trim();
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
        if (space.size() == 2) System.out.println(bk1 + sl1 + space.get(0) + bk2 + sl2 + space.get(1) + bk3 + sl3);
        if (space.size() == 3)
            System.out.println(space.get(0) + bk1 + sl1 + space.get(1) + bk2 + sl2 + space.get(2) + bk3 + sl3);
        if (space.size() == 4)
            System.out.println(space.get(0) + bk1 + sl1 + space.get(1) + bk2 + sl2 + space.get(2) + bk3 + sl3 + space.get(3));
    }

    public static void method2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        boolean upDone = false; // если увеличили первый символ слова

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && upDone) {
                upDone = false;
                continue;
            }
            if (s.charAt(i) == ' ')
                continue;
            if (s.charAt(i) != ' ' && !upDone) {
                s = s.substring(0, i) + ((s.substring(i, i + 1)).toUpperCase()) + s.substring(i + 1);
                upDone = true;
            }
        }
        System.out.println(s);
    }
}
