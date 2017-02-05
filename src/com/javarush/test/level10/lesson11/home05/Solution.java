package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {
    public static void main(String[] args)  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < alphabet.size(); i++) {
            map.put(alphabet.get(i), 0);
        }
        for (int i = 0; i < list.size() ; i++) {
            for (int k = 0; k < list.get(i).length() ; k++) {
                for (int j = 0; j < alphabet.size(); j++) {
                    char a = list.get(i).charAt(k);
                    if (alphabet.get(j).equals(a)) {
                        int b = map.get(a);
                        map.put(a, b + 1);
                        break;
                    }

                }
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + map.get(alphabet.get(i)));
        }
    }

}
