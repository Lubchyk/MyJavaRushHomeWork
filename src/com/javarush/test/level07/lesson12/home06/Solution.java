package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя // мама
Имя: Катя, пол: женский, возраст: 55  //баба
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня // син
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("Дідо_Коля", true, 55, null, null);
        Human grandFather2 = new Human("Дідо_Ваня", true, 55,null,null);
        Human grandMather1 = new Human("Баба_Катя",false, 55,null,null);
        Human grandMather2 = new Human("Баба_Даша", false, 55,null,null);
        Human father = new Human("Тато_Михаил" , true, 21, grandFather1, grandMather1);
        Human mather = new Human("Мама_Аня" , false, 21, grandFather2, grandMather2);
        Human son1 = new Human("Син1_Вася" , true, 2, father, mather);
        Human son2 = new Human("Син2_Игорь", true, 2, father,mather);
        Human douter = new Human("Дочка_Таня", false, 2, father, mather);
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMather1.toString());
        System.out.println(grandMather2.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(douter.toString());


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public  Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
