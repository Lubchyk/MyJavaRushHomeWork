package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catgrandfather = new Cat(grandfatherName);

        String grandmatherName = reader.readLine();
        Cat catgrendmather = new Cat(grandmatherName);

        String fatherName = reader.readLine();
        Cat catfather = new Cat(fatherName, catgrandfather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catgrendmather);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catfather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catfather, catMother);

        System.out.println(catgrandfather);
        System.out.println(catgrendmather);
        System.out.println(catfather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);


    }

    public static class Cat
    {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name)
        {
            this.name = name;
        }

//        Cat(String name, Cat parent1)
//        {
//            this.name = name;
//            this.parent = parent1;
//        }
        Cat(String name, Cat parent2, Cat parent1 )
        {
            this.name = name;
            this.parent = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString()
        {
            if (parent == null && parent2 == null) return "Cat name is " + name + ", no mother, no father";
            if (parent != null && parent2 == null) return "Cat name is " + name + ", mother is " + parent.name +", no father";
            if (parent == null && parent2 != null) return "Cat name is " + name + ", no mother, father is "+ parent2.name;

            else
                return "Cat name is " + name + ", mother is " + parent.name + ", father is "+ parent2.name;
        }
    }

}
