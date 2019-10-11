package Notes;

import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Default constructor and methods

        Dog dog1 = new Dog();
        System.out.println("Enter name of dog: ");
        String name = in.nextLine();
        dog1.nameDog(name);
        System.out.println("Enter breed of dog: ");
        String breed = in.nextLine();
        dog1.setBreed(breed);

        System.out.println(dog1.name + ", " + dog1.breed);

        // OR secondary constructor

        Dog dog2 = new Dog(name, breed);
        System.out.println(dog2.name + ", " + dog2.breed);
    }
}