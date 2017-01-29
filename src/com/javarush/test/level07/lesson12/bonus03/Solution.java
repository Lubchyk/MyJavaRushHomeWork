package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }
    public static void sort(int[] array) {
        int len = array.length;
        int temp;

        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sort1(int[] array) {
     int[] array2 = new int[array.length];
        int o = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) o++;
        }
        for (int j = 0; j < array2.length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max && array[i] != 0) max = array[i];
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max) {
                    array[i] = 0;
                    break;
                }
            }
                if (max > 0) array2[j] = max;
                else if (max < 0 && o != 0) {
                    for (int k = 0; k < o; k++) {
                        array2[j] = 0;
                        j++;
                    }
                    o = 0;
                }
                if (max < 0 && o == 0) array2[j] = max;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array2[i];
        }
    }
}
