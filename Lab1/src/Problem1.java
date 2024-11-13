import java.util.Scanner;

class Data {
    private double sum; // Сумма  всех введенных чичел
    private int count; // Количество всех чисед
    private double max; // Макс. значение


    // Конструктор для инициализации пустого набора данных:
    public Data() {
        sum = 0;
        count = 0;
        max = Double.NEGATIVE_INFINITY;
    }


    // Метод для добавления значения набора данных:
    public void addValue(double value) {
        sum += value;
        count++;
        if (value > max) {
            max = value;
        }
    }


    // Метод для вычисления среднего значения:
    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }


    // Метод для получения Макс. значения:
    public double getMax() {
        if (count == 0) {
            return 0;
        }
        return max;
    }
}


class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data d = new Data();

        while(true) {
            System.out.print("Enter the number (Q to quit): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                d.addValue(value);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input");
            }
        }

        System.out.println("Average: " + d.getAverage());
        System.out.println("Max: " + d.getMax());

        sc.close();

    }
}