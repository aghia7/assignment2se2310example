import interfaces.Shape;
import models.Circle;
import models.Rectangle;
import models.Triangle;

import java.util.ArrayList;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();

        list.add(new Circle(5));
        list.add(new Rectangle(4,5));
        list.add(new Triangle(3, 4, 5));

        printShapes(list);
    }

    public static void printShapes(Iterable<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("area: " + shape.area());
            System.out.println("perimeter: " + shape.perimeter());
            System.out.println("++++++++++++++++");
        }
    }
}
