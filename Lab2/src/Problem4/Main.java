package Problem4;

public class Main {
    public static void main(String[] args) {
        Circuit resistorA = new Resistor(3.0);
        Circuit resistorB = new Resistor(3.0);
        Circuit resistorC = new Resistor(6.0);
        Circuit resistorD = new Resistor(3.0);
        Circuit resistorE = new Resistor(2.0);


        Circuit seriesCircuit = new Series(resistorA, resistorB);
        Circuit parallelCircuit = new Parallel(resistorC, resistorD);
        Circuit complexSeries = new Series(parallelCircuit, resistorE);
        Circuit finalCircuit = new Parallel(complexSeries, seriesCircuit);


        finalCircuit.applyPotentialDiff(10);


        System.out.println("Total Resistance: " + finalCircuit.getResistance());
        System.out.println("Total Current: " + finalCircuit.getCurrent());
        System.out.println("Total Power: " + finalCircuit.getPower());
    }
}
