package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        calculation(n1, n2, n3);
    }
    public static void calculation(int a, int b, int c) {
        if (a > b && a > c) {
            if (b > c) System.out.println(b);
            else System.out.println(c);
        }
        if (b > a && b > c) {
            if (a > c) System.out.println(a);
            else System.out.println(c);
        }
        if (c > b && c > a) {
            if (b > a) System.out.println(b);
            else System.out.println(a);
        }
    }
}
