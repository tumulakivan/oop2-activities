abstract class Shape {
    public abstract void draw();

    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Activity9 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.displayInfo();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.displayInfo();
        rectangle.draw();
    }
}