package Problem1_C;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person person1 = new Person("Alice", 30);
        Person person2 = new Employee("Alice", 30, "E123");

        people.add(person1);
        people.add(person2);

        System.out.println("HashSet contents: " + people);
    }
}
