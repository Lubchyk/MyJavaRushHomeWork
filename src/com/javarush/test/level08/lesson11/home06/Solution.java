package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collection;

public class Solution
{
    public static void main(String[] args) {
        ArrayList<Human> child1 = new ArrayList<Human>();
        ArrayList<Human> child2 = new ArrayList<Human>();
        ArrayList<Human> child3 = new ArrayList<Human>();

        Human son1 = new Human("Son1", true, 3, new ArrayList<Human>());
        Human son2 = new Human("Son2", true,7, new ArrayList<Human>());
        Human daughter = new Human("Daughter", false, 5, new ArrayList<Human>());

        child3.add(son1);
        child3.add(son2);
        child3.add(daughter);

        Human father = new Human("Tato", true, 28, child3);
        Human mother = new Human("Mama", false, 27, child3);

        child1.add(father);
        child2.add(mother);

        Human grandFather1 = new Human("Dido1", true, 55, child1);
        Human grendFather2 = new Human("Dido2", true, 55, child2);
        Human grendMother1 = new Human("Baba1", false, 56, child1);
        Human grendMother2 = new Human("Baba2", false, 56, child2);
        System.out.println(grandFather1.toString());
        System.out.println(grendFather2.toString());
        System.out.println(grendMother1.toString());
        System.out.println(grendMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

       public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }
}
