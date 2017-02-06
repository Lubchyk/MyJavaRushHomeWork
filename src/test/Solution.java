package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by АНТ on 19.01.2017.
 */
/* Классы Cat и Dog от Pet
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public interface Fly {
    int getPointsXY();
}
    public interface Run {
    int getPointsXY();
}
    public interface Swim {
    int getPointsXY();
}

    public static abstract class Pet
    {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
    public String getName() {
        return "Cat";
        }
        public Pet getChild() {
        Pet cat = new Cat();
        return cat;
        }
    }

    public static class Dog extends Pet {
        public String getName() {
            return "Dog";
        }
        public Pet getChild() {
            Pet dog = new Dog();
            return dog;
        }
    }


}
