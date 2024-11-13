package Problem3;

public class Main {
    public static void main(String[] args) {
        // Пример 1: Создаем объект по умолчанию (0 градусов Цельсия)
        Temperature temp1 = new Temperature();
        System.out.println("Temp1 (default): " + temp1.getCelsius() + "C, " + temp1.getFahrenheit() + "F");

        // Пример 2: Создаем объект с температурой 100 градусов Цельсия
        Temperature temp2 = new Temperature(100);
        System.out.println("Temp2: " + temp2.getCelsius() + "C, " + temp2.getFahrenheit() + "F");

        // Пример 3: Создаем объект с температурой 32 градуса по Фаренгейту
        Temperature temp3 = new Temperature(32, 'F');
        System.out.println("Temp3: " + temp3.getCelsius() + "C, " + temp3.getFahrenheit() + "F");

        // Пример 4: Создаем объект с шкалой Фаренгейта, температура по умолчанию 0
        Temperature temp4 = new Temperature('F');
        System.out.println("Temp4: " + temp4.getCelsius() + "C, " + temp4.getFahrenheit() + "F");

        // Пример 5: Устанавливаем значение и шкалу для Temp1 (37 градусов Цельсия)
        temp1.setTempAndScale(37, 'C');
        System.out.println("Temp1 (after setting 37C): " + temp1.getCelsius() + "C, " + temp1.getFahrenheit() + "F");
    }
}


