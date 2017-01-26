package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list2 = initializeArray1();
        int f = min5(list2.get(0), list2.get(1), list2.get(2), list2.get(3), list2.get(4));
        list3.add(f);
        list2 = removeMin(list2, f);
        f = min4(list2.get(0), list2.get(1), list2.get(2), list2.get(3));
        list3.add(f);
        list2 = removeMin(list2, f);
        f = min3(list2.get(0), list2.get(1), list2.get(2));
        list3.add(f);
        list2 = removeMin(list2, f);
        f = min2(list2.get(0), list2.get(1));
        list3.add(f);
        list2 = removeMin(list2, f);
        list3.add(list2.get(0));
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
    public static ArrayList initializeArray1(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int a;
        for (int i = 0; i < 5; i++) {
            a = scanner.nextInt();
            list.add(a);
        }
        return list;
    }
    public static int min5(int a0, int a1, int a2, int a3, int a4){
        int y = min2(a0, a1);
        int x = min2(a2, a3);
        int z = min2(y, x);
        int v = min2(z, a4);
        return v;
    }
    public static int min4(int a0, int a1, int a2, int a3){
        int y = min2(a0, a1);
        int x = min2(a2, a3);
        int z = min2(y, x);
        return z;
    }
    public static int min3(int a0, int a1, int a2){
        int y = min2(a0, a1);
        int z = min2(y, a2);
        return z;
    }
    public static int min2(int a0, int a1){
        int z;
        if (a0 <= a1) z = a0;
        else z = a1;
        return z;
    }
    public static ArrayList removeMin(ArrayList<Integer> list, int z) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == z) {
                list.remove(i);
                break;
            }
        }
        return list;
    }
}
