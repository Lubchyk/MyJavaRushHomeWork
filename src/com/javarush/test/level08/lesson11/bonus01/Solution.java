package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Map<String, String> map = new HashMap<String, String>();
        map.put("January", " is 1 month");
        map.put("February", " is 2 month");
        map.put("March", " is 3 month");
        map.put("April", " is 4 month");
        map.put("May", " is 5 month");
        map.put("June", " is 6 month");
        map.put("July", " is 7 month");
        map.put("August", " is 8 month");
        map.put("September", " is 9 month");
        map.put("October", " is 10 month");
        map.put("November", " is 11 month");
        map.put("December", " is 12 month");
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(s)) System.out.println(pair.getKey() + pair.getValue());
        }


    }

}
