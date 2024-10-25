import Stereometry.*;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 6, 8);
        triangle.printInfo();
        System.out.println("============");
        Circle circle = new Circle(6);
        circle.printInfo();
        System.out.println("============");
        Square square = new Square(123.456);
        square.printInfo();
        System.out.println("============");
        Rectangle rectangle = new Rectangle(8,2);
        rectangle.printInfo();
        System.out.println("============");
        Cube cube = new Cube(1.11911);
        cube.printInfo();
        System.out.println("============");
        RectangularParallelepiped parallelepiped = new RectangularParallelepiped(8, 2, 4);
        parallelepiped.printInfo();
        System.out.println("============");
        Sphere sphere = new Sphere(2.24);
        sphere.printInfo();
    }
}
