package Assignment;

class Animal {
    String name;
    void speak() {
        System.out.println("Animal sound...");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow!");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.speak();
        c.speak();
    }
}

