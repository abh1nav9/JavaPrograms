// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();

    // Concrete method to display the area
    void displayArea() {
        System.out.println("The area is: " + calculateArea());
    }
}

// Subclass Circle extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Shape circle = new Circle(5);
        circle.displayArea(); // Display the area of the circle

        // Create a Rectangle object with length 4 and width 6
        Shape rectangle = new Rectangle(4, 6);
        rectangle.displayArea(); // Display the area of the rectangle
    }
}
