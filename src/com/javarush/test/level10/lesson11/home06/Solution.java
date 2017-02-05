package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }
    public static class Human {
        String name;
        byte age;
        int strong;
        double tall;
        Object level;
        boolean sex;

        public Human(String name) {
            this.name = name;
        }
        public Human(String name, byte age) {
            this.age = age;
        }
        public Human(String name, byte age, int strong) {
            this.name = name;
            this.age = age;
            this.strong = strong;
        }
        public Human(String name, byte age, int strong, double tall) {
            this.name = name;
            this.age = age;
            this.strong = strong;
            this.tall = tall;
        }
        public Human(String name, byte age, int strong, double tall, Object level) {
            this.name = name;
            this.age = age;
            this.strong = strong;
            this.tall = tall;
            this.level = level;
        }
        public Human(String  name, byte age, int strong, double tall, Object level, boolean sex) {
            this.name = name;
            this.age = age;
            this.strong = strong;
            this.tall = tall;
            this.level = level;
            this.sex  = sex;
        }
        public Human(String name, byte age, double tall, int strong, boolean sex) {
            this.name = name;
            this.age = age;
            this.tall = tall;
            this.strong = strong;
            this.sex = sex;
        }
        public Human(String name, int strong, Object level, boolean sex) {
            this.name = name;
            this.strong = strong;
            this.level = level;
            this.sex = sex;
        }
        public Human(boolean sex, Object level) {
            this.sex = sex;
            this.level = level;
        }
        public Human(byte age, double tall, int strong) {
            this.age = age;
            this.tall = tall;
            this.strong = strong;
        }
    }
}
