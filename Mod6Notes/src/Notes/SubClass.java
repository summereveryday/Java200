package Notes;

public class SubClass extends SuperClass {
    // overwrites the SuperClass's number
    int number = 10;

    @Override
    public void display() {
        System.out.println("Subclass number is " + number);
        super.display();
    }
}
