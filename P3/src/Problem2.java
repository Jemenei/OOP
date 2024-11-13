import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}


class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}


class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}


public class Problem2 {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a person\n2. Print all people\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter 1 for Person, 2 for Student, 3 for Staff:");
                    int type = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter address:");
                    String address = sc.nextLine();

                    if (type == 1) {
                        people.add(new Person(name, address));
                    } else if (type == 2) {
                        System.out.println("Enter program:");
                        String program = sc.nextLine();
                        System.out.println("Enter year:");
                        int year = sc.nextInt();
                        System.out.println("Enter fee:");
                        double fee = sc.nextDouble();
                        people.add(new Student(name, address, program, year, fee));
                    } else if (type == 3) {
                        System.out.println("Enter school:");
                        String school = sc.nextLine();
                        System.out.println("Enter pay:");
                        double pay = sc.nextDouble();
                        people.add(new Staff(name, address, school, pay));
                    }
                    break;

                case 2:
                    for (Person p : people) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
