class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal maked a sound");
    }

    public void sound(String additionalSound) {
        System.out.println("Animal makes a sound " + additionalSound);
    }
}


class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void sound() {
        super.sound();
        System.out.println("Dog barks");
    }

    public void sound(int times) {
        for(int i = 0; i < times; i++) {
            System.out.println("Dog barks " + (i + 1) + ("time(s)"));
        }
    }
}


public class Problem1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Khan");

        myAnimal.sound();
        myDog.sound();
        myDog.sound("Loud bark");
        myDog.sound(3);
    }
}