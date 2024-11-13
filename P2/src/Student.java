public class Student {
    private String name;
    private int id, yearOfStudy;

    public Student(String name, int id) {
        this(name, id, 1);
    }

    public Student(String name, int id, int yearOfStudy) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Zeinulla Yerkebulan", 24041007);
        Student student2 = new Student("Suleimen Madi", 23030398, 2);

        System.out.println(student1.getName() + ": " + student1.getYearOfStudy());
        student1.incrementYearOfStudy();
        System.out.println("Updated Year: " + student1.getYearOfStudy());

        System.out.println(student2.getName() + ": " + student2.getYearOfStudy());
        student2.incrementYearOfStudy();
        System.out.println("Updated Year: " + student2.getYearOfStudy());
    }
}
