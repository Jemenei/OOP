import java.util.Vector;


enum Color {
    RED, GREEN, BLUE, YELLOW
}

abstract class Shape {
    protected Color color;
    protected int  position;

    public Shape(int position, Color color) {
        this.position = position;
        this.color = color;
    }

    public abstract void draw();
}


class Circle extends Shape {
    private int radius;

    public Circle(int position, Color color, int radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle at position " + position + " with color " + color + " and radius " + radius);
    }
}


class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int position, Color color, int width, int height) {
        super(position, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at position " + position + " with color " + color + ", width " + width + " and height " + height);
    }
}


class Triangle extends Shape {
    private int base, height;

    public Triangle(int position, Color color, int base, int height) {
        super(position, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle at position " + position + " with color " + color + ", base " + base + " and height " + height);
    }
}



public class Problem1 {
    public static void main(String[] args) {

        Vector<Shape> shapes = new Vector<>();


        shapes.add(new Circle(1, Color.RED, 5));
        shapes.add(new Rectangle(2, Color.GREEN, 10, 20));
        shapes.add(new Triangle(3, Color.BLUE, 15, 25));


        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
