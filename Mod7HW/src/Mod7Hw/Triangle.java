package Mod7Hw;
import java.util.*;

public class Triangle extends GeometricObject {
    Scanner in = new Scanner(System.in);

     double area;
     double perimeter;

    Triangle () {
        super();
    }

    Triangle (String color, boolean fill){
        super(color, fill);
    }

    @Override
    public double getArea() {
        System.out.println("Enter base length: ");
        double base = in.nextInt();
        System.out.println("Enter triangle height: ");
        double height = in.nextInt();
        this.area = .5*base*height;
        return 0;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Enter side 1 length: ");
        double side1 = in.nextInt();
        System.out.println("Enter side 2 length: ");
        double side2 = in.nextInt();
        System.out.println("Enter side 3 length: ");
        double side3 = in.nextInt();
        this.perimeter = side1 + side2 + side3;
        return 0;
    }
}
