package BonusTask;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Введите кол. подозреваемых: ");
        int n = sc.nextInt();
        n = Math.min(n, 5);

        Person[] p = new Person[n];
        System.out.println("Введите имена для " + n + " подозреваемых: ");


        for(int i = 0; i < n; i++) {
            System.out.println("Имя для подозреваемого " + (i + 1) + ": ");
            String name = sc.next();
            p[i] = new Person(name);
        }


        int ind = r.nextInt(n);
        Detective d = new Detective();

        while(!d.isSpy(p[ind])) {
            p[ind].setGeneratedKey((int) Math.pow(2, r.nextInt(5) + 1));
        }

        System.out.println("\n Выбирайте:");
        for(int i = 0; i < n; i++) {
            System.out.println(p[i].getName() + "-" + (i + 1));
        }

        System.out.println("\n Выведите номер подозреваемого: ");
        int userChoice = sc.nextInt();

        if(userChoice == ind) {
            System.out.println("Выиграл");
        } else {
            System.out.println("Проиграл");
        }

        sc.close();

    }
}
