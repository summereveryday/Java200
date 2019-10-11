package Hospital;

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

        System.out.println("How many patients do you want to add?: ");
        int numPatients = in.nextInt();
        in.nextLine();
        Patient[] patientList = new Patient[numPatients];

        for (int i = 0; i < numPatients; i++){
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
            in.nextLine();
            patientList[i] = new Patient(name, street, apt, city, state, zip, amount_owed, amount_paid, payment_due_date);
        }

        for (int i = 0; i < numPatients; i++){
            System.out.println("Patient: " + patientList[i].name);
            System.out.println("\t\t" + patientList[i].street);
            if (!patientList[i].apt.equals("n/a")){
                System.out.println("\t\t" + patientList[i].apt);
            }
            System.out.println("\t\t" + patientList[i].city + ", " + patientList[i].state);
            System.out.println("\t\t" + patientList[i].zip);
            System.out.println("Amount Due: " + patientList[i].amount_owed);
            System.out.println("Amount Paid: " + patientList[i].amount_paid);
            System.out.println("Due Date: " + patientList[i].payment_due_date);
        }
    }
}