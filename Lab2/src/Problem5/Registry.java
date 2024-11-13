package Problem5;
import java.util.ArrayList;

public class Registry {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public void printRegistry() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void transferPet(Person from, Person to) {
        if (from.hasPet()) {
            Animal pet = from.pet;
            if (to instanceof PhDStudent && pet instanceof Dog) {
                System.out.println("PhD students cannot take care of dogs.");
            } else {
                from.removePet();
                to.assignPet(pet);
                System.out.println(from.name + " transferred " + pet + " to " + to.name);
            }
        } else {
            System.out.println(from.name + " has no pet to transfer.");
        }
    }
}
