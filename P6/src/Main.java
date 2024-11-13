import java.security.cert.CertPathParameters;

public class Main {
    public static void main(String[] args) {
        CanHavePizza cat = new Cat("Тигра");
        CanHavePizza student = new Student("Мади");
        Restaurant papaJohns = new Restaurant("Papa Johns");

        papaJohns.servePizza(cat);
        papaJohns.servePizza(student);

        if (student instanceof CanHaveParty) {
            ((CanHaveParty) student).dance();
        }
    }
}
