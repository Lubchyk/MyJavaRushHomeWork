package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }
    public static void sort(String[] array) {
//        String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"} ;
//        int count = 0;
//        for (int i = 0; i <alphabet.length ; i++) {
//            for (int j = 0; j < array.length; j++) {
//
//                String a = String.valueOf(array[j].charAt(0));
//
//                if (alphabet[i].equalsIgnoreCase(a)) {
//
//                    String temp = array[count];
//
//                    array[count] = array[j];
//                    array[j] = temp;
//                    count++;
//                }
//            }
//        }
        Arrays.sort(array);
    } // http://study-java.ru/uroki-java/urok-11-sortirovka-massiva/

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
