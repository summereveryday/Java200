import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        String street;
        String apt;
        String city;
        String state;
        int zip;
        double amount_owed;
        double amount_paid;
        String payment_due_date;

        System.out.print("Enter patient first and last name: ");
        name = in.nextLine();
        System.out.print("Enter patient street number and name: ");
        street = in.nextLine();
        System.out.print("Enter patient apt. (n/a if not needed): ");
        apt = in.nextLine();
        System.out.print("Enter patient city: ");
        city = in.nextLine();
        System.out.print("Enter patient state: ");
        state = in.next();
        System.out.print("Enter patient zip code: ");
        zip = in.nextInt();
        System.out.print("Enter amount owed: $");
        amount_owed = in.nextDouble();
        System.out.print("Enter amount paid: $");
        amount_paid = in.nextDouble();
        System.out.print("Enter payment due date: ");
        payment_due_date = in.next();

        System.out.println("Patient: " + name);
        System.out.println("\t\t" + street);
        if (!apt.equals("n/a")){
            System.out.println("\t\t" + apt);
        }
        System.out.println("\t\t" + city + ", " + state);
        System.out.println("\t\t" + zip);
        System.out.println("Amount Due: " + amount_owed);
        System.out.println("Amount Paid: " + amount_paid);
        System.out.println("Due Date: " + payment_due_date);
    }
}