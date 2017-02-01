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
        method2();
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
