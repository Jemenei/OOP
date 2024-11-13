package Problem5;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return name + " (" + getOccupation() + ") " + (hasPet() ? "owns " + pet : "has no pet");
    }
}

