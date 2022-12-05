package lesson1;

public class HomeWork_6_2
{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик", 450, 15);
        Dog dog2 = new Dog("Шарик", 520, 8);
        Cat cat1 = new Cat("Мурка", 180, 5);
        Cat cat2 = new Cat("Рыжик", 210, 0);

        Animal [] animals = {dog1, dog2, cat1, cat2};

        for (Animal animal : animals) {
            animal.printInfo();
        }

        System.out.printf("Создано собак: %s%nСоздано кошек: %s%nВсего создано животных: %s%n", Dog.getDogCount(), Cat.getCatCount(), (Dog.getDogCount() + Cat.getCatCount()));
    }
}
