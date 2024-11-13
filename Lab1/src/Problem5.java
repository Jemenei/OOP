import java.util.Vector;

enum Gender {
    BOY, GIRL;
}

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String toString() {
        return this.gender == Gender.BOY ? "B" : "G";
    }
}

class DragonLaunch {
    private Vector<Person> kidnappedStudents;

    public DragonLaunch() {
        kidnappedStudents = new Vector<>();
    }

    public void kidnap(Person p) {
        kidnappedStudents.add(p);
    }

    public boolean willDragonEatOrNot() {
        Vector<Person> tempList = new Vector<>(kidnappedStudents);

        boolean vanished = true;

        while(vanished) {
            vanished = false;

            for (int i = 0; i < tempList.size() - 1; i++) {
                Person current = tempList.get(i);
                Person next = tempList.get(i + 1);

                if(current.getGender() == Gender.BOY && next.getGender() == Gender.GIRL) {
                    tempList.remove(i);
                    tempList.remove(i);
                    vanished = true;
                    break;
                }
            }
        }
        return !tempList.isEmpty();
    }
}


public class Problem5 {
    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();

        launch.kidnap(new Person(Gender.BOY));
        launch.kidnap(new Person(Gender.GIRL));
        launch.kidnap(new Person(Gender.GIRL));

        System.out.println("Останутся ли люди для дракона? " + launch.willDragonEatOrNot());

    }
}
