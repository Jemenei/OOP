package Problem5;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();


        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "AI Research");
        Person bob = new Student("Bob", 20, "Computer Science");


        Animal murka = new Cat("Murka", 3);
        Animal rex = new Dog("Rex", 5);


        john.assignPet(rex);
        bob.assignPet(murka);


        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);


        registry.printRegistry();


        System.out.println("\nTransfer Rex from John to Alice:");
        registry.transferPet(john, alice);

        System.out.println("\nTransfer Murka from Bob to Alice:");
        registry.transferPet(bob, alice);


        System.out.println("\nUpdated Registry:");
        registry.printRegistry();
    }
}
