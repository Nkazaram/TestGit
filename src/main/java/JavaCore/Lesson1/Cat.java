package JavaCore.Lesson1;

import java.security.SecureRandom;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String _name, String _color, int _age) {
        name = _name;
        color = _color;
        age = _age;
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "Brown", "4");
        Cat cat2 = new Cat("Murza", "White", "5");
    }

}
