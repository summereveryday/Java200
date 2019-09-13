import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    // More types and operators

        boolean b = false;

        if(b==false) {
            System.out.println("boolean b is false");
        }
        // brackets aren't needed if you're doing a single statement
        else {
            System.out.println("boolean b is not false");
        }

        int grade = 95;

        if (grade >= 90){
            System.out.println("You got an A");
        }
        else if (grade >= 80){
            System.out.println("You got a B");
        }
        else {
            System.out.println("You got a C ... or worse");
        }

        // When this runs, you get an A. It doesn't print A AND B because it looks for the first true condition.
        // You don't have to use ranges like in C++!

        // ! not, && and, || or, ^ XOR

        // Must use numbers. Can't compare strings.
        switch (grade){
            case 90: System.out.println("You got an A");
                break;
            case 80: System.out.println("You got a B");
                break;
            case 70: System.out.println("You got a C or worse.");
            default: System.out.println("Grades are a bad example for switch-cases.");
                System.exit(1);
        }



    }
}
