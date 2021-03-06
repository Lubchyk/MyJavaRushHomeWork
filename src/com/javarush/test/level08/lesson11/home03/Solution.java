package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("aaa1", "aaa1");
        result.put("aaa2", "aaa2");
        result.put("aaa3", "aaa3");
        result.put("aaa4", "aaa7");
        result.put("aaa5", "aaa5");
        result.put("aaa6", "aaa6");
        result.put("aaa3", "aaa7");
        result.put("aaa8", "aaa8");
        result.put("aaa2", "aaa9");
        result.put("aaa0", "aaa1");

        return result;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
