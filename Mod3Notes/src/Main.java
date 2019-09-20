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
    }
}
