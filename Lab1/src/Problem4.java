import java.util.ArrayList;
import java.util.Scanner;

class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisite;

    public Course(String name, String description, int credits, String prerequisite) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public String toString() {
        return name + ": " + description + " (" + credits + " credits) Prerequisite: " + prerequisite;
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " (grade: " + grade + ")";
    }
}

class GradeBook {
    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.toString() + "!");
    }

    public void displayGradeReport() {
        double total = 0;
        int highestGrade = Integer.MIN_VALUE;
        int lowestGrade = Integer.MAX_VALUE;
        Student highestStudent = null;
        Student lowestStudent = null;

        for (Student student : students) {
            int grade = student.getGrade();
            total += grade;
            if (grade > highestGrade) {
                highestGrade = grade;
                highestStudent = student;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestStudent = student;
            }
        }

        double average = total / students.size();
        System.out.println("Class average grade: " + average);
        System.out.println("Lowest grade: " + lowestGrade + " (" + lowestStudent.getName() + ")");
        System.out.println("Highest grade: " + highestGrade + " (" + highestStudent.getName() + ")");
    }

    private void outputBarChart() {
        int[] frequency = new int[11];
        for(Student student : students) {
            int grade = student.getGrade();
            frequency[grade / 10]++;
        }

        System.out.println("Grades distribution: ");
        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) {
                System.out.print(" ");
            } else {
                System.out.print(frequency[i] + " ");
            }

            for (int stars = 0; stars < frequency[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



public class Problem4 {
    public static void main(String[] args) {
        // Создаем курс
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");

        // Создаем список студентов
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Вводим оценки студентов
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter name and grade for student " + (i + 1) + ":");
            String name = scanner.next();
            int grade = scanner.nextInt();
            students.add(new Student(name, grade));
        }

        // Создаем книгу оценок и выводим отчеты
        GradeBook gradeBook = new GradeBook(course, students);
        gradeBook.displayMessage();
        gradeBook.displayGradeReport();
    }
}