import java.util.*;

public class Shape {

    // Method to calculate the area of a triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        // Calculate and print the area of a triangle
        double triangleArea = shape.area(10, 5);
        System.out.println("Area of the triangle: " + triangleArea);

        // Calculate and print the area of a rectangle
        double rectangleArea = shape.area(10, 5);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate and print the area of a circle
        double circleArea = shape.area(7);
        System.out.println("Area of the circle: " + circleArea);
    }
}
