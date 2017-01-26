package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        List<Integer> list  = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        String w = reader.readLine();
        int n = Integer.parseInt(q);
        int m = Integer.parseInt(w);
        for (int i = 0; i < n; i++) {
            String a = reader.readLine();
            int b = Integer.parseInt(a);
            list.add(i, b);
            }
        for (int i = 0; i < m; i++) {
            int c = list.get(0);
            list.remove(0);
            list.add(c);
        }
        for (Integer x : list) {
            System.out.println(x);
        }
        }
    }

