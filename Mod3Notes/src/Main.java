import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //loops: for, while, do-while

        for (int i = 0; i <10; i++){
            System.out.print(i + "\n");
        }

        int n;
        System.out.print("Enter the numeral 3: ");
        n = in.nextInt();
        while (n != 3){
            System.out.print("C'mon. That's not 3. Try again: ");
            n = in.nextInt();
        }


        do {
            System.out.print("Enter the numeral 5: ");
            n = in.nextInt();
        } while (n != 5);

        //METHODS

        System.out.println(add(5, 3));
        subtract(5, 3);
    }


    // METHODS
    // public vs private
    // static void means there's no return
    // main is the name of the method

    public static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    //overload method so now you add either ints or floats
    public static float add(float num1, float num2){
        float sum = num1 + num2;
        return sum;
    }

    public static void subtract(int num1, int num2){
        int diff = num1 - num2;
        System.out.println(diff);
    }

}
