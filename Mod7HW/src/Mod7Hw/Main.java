package Mod7Hw;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //11.11 Sort Array List
        System.out.println("11.11 Sort Array List\n");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            list.add(in.nextInt());
        }
        sort(list);

        //13.1 Extend GeometricObject Class
        System.out.println("13.1 Triangle Extends Class\n");
        in.nextLine();
        System.out.print("Enter the color of your triangle: ");
        String color = in.nextLine();
        System.out.print("Is your triangle a solid color? Enter 'y' or 'n': ");
        Character yn = in.next().charAt(0);
        in.nextLine();
        boolean fill;
        if (yn == 'y'){
            fill = true;
        }
        else{ fill = false;}
        Triangle triangle = new Triangle(color, fill);
        triangle.getArea();
        triangle.getPerimeter();

        System.out.println("Your Triangle\n");
        System.out.println("Area: " + triangle.area);
        System.out.println("Perimeter: " + triangle.perimeter);
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

    }

    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }

}
