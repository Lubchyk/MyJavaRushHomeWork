package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }
    public static void sort(String[] array) {
        List<String> list1 = new ArrayList<String>();
        List<String> list = new ArrayList<String>();

        int g = 0;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) { list1.add(array[i]);
            }
            else {
                list.add(array[i]);
            }
        }
        list = sort2(list);
        list1 = sort2(list1);
        int f = list1.size() - 1;
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = list1.get(f);
                f--;
            }
            else { array[i] = list.get(g);
                g++;
            }
        }
    }
    public static List<String> sort2(List<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < list.size(); j++) {
               if (list.size() > j + 1) {
                    try {
                      int a = Integer.parseInt(list.get(j));
                      int b = Integer.parseInt(list.get(j + 1));
                      if (a > b) {
                          int temp1 =  Integer.parseInt(list.get(j));
                          list.set(j, list.get(j + 1));
                          list.set(j + 1, String.valueOf(temp1));
                      }
                    } catch (Exception e) {
                        if (isGreaterThan(list.get(j), list.get(j + 1))) {
                            String temp = list.get(j);
                            list.set(j, list.get(j + 1));
                            list.set(j + 1, temp);
                        }
                    }
                }
            }
        }
        return list;
    }
    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    //строка - это на самом деле число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
                 {
                return false;  }
        }
        return true;
    }
}
