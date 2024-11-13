enum FuelType {
    PETROL, DIESEL, ELECTRIC, HYBRID
}

public class Problem2 {
    private static int totalVehicles = 0;

    private final String model;

    private static final int MIN_YEAR = 1886;

    private final int year;

    private FuelType fuelType;

    private int speed;

    {
        speed = 0;
    }

    public Problem2(String model, int year, FuelType fuelType) {
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        Problem2.totalVehicles++;
    }

    public Problem2(String model, int year) {
        this(model, year, FuelType.PETROL);
    }

    public static int getTotalVehicles() {
        return Problem2.totalVehicles;
    }

    public final int getYear() {
        return this.year;
    }

    public void accelerate() {
        this.speed += 10;
    }

    public void accelerate(int increment) {
        this.speed += increment;
    }

    public String getModel() {
        return this.model;
    }

    public FuelType getFuelType() {
        return this.fuelType;
    }

    public int getSpeed() {
        return this.speed;
    }

    public static int getMinYear() {
        return MIN_YEAR;
    }

    public static void main(String[] args) {
        Problem2 car1 = new Problem2("Sedan", 2020, FuelType.PETROL);
        Problem2 car2 = new Problem2("Truck", 2018, FuelType.DIESEL);
        Problem2 car3 = new Problem2("Bike", 2022);

        System.out.println("Car1 Model: " + car1.getModel() + ", Year: " + car1.getYear() + ", Fuel: " + car1.getFuelType());
        System.out.println("Car2 Model: " + car2.getModel() + ", Year: " + car2.getYear() + ", Fuel: " + car2.getFuelType());
        System.out.println("Car3 Model: " + car3.getModel() + ", Year: " + car3.getYear() + ", Fuel: " + car3.getFuelType());


        System.out.println("Total Vehicles: " + Problem2.getTotalVehicles());


        car1.accelerate();
        car2.accelerate(25);

        System.out.println("Car1 Speed after acceleration: " + car1.getSpeed());
        System.out.println("Car2 Speed after acceleration: " + car2.getSpeed());

        System.out.println("Minimum year a vehicle can be built: " + Problem2.getMinYear());
    }
}
