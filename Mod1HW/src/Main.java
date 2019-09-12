import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("HW 1.3:");
        System.out.println("    J    A    V     V    A");
        System.out.println("    J   A A    V   V    A A");
        System.out.println("J   J  AAAAA    V V    AAAAA");
        System.out.println(" J J  A     A    V    A     A");

        System.out.println("HW 1.5:");
        double answer;
        answer = ((9.5*4.5)-(2.5*3))/(45.5-3.5);
        System.out.println(answer);

        System.out.println("HW 2.3: Convert Feet into Meters");
        double feet;
        double meters;
        System.out.print("Enter a number: ");
        feet = in.nextDouble();
        meters = feet / 3.281;
        System.out.println(feet + " feet is equal to " + meters + " meters.");


        System.out.println("HW 2.13:");
        int count = 0;
        double interest = 0.05/12;
        double deposit;
        double savings = 0;
        System.out.print("Enter a monthly saving amount: ");
        deposit = in.nextDouble();
        while (count < 6){
            savings = (deposit + savings) * (1 + interest);
            count++;
        }
        savings = (int)(savings * 100) / 100.0;
        System.out.print("After six months, savings amount equals: $" + savings);
    }
}

