package Hospital;

public class Patient {
    String name;
    String street;
    String apt;
    String city;
    String state;
    int zip;
    double amount_owed;
    double amount_paid;
    String payment_due_date;

    public Patient(String name, String street, String apt, String city, String state, int zip, double amount_owed, double amount_paid, String payment_due_date) {
        this.name = name;
        this.street = street;
        this.apt = apt;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.amount_owed = amount_owed;
        this.amount_paid = amount_paid;
        this.payment_due_date = payment_due_date;
    }
}
