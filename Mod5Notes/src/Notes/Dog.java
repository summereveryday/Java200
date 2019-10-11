package Notes;

public class Dog
{
    String name;
    String breed;

    // Default constructor

    Dog (){
        name = null;
        breed = null;
    }

    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    void bark(){
        System.out.println("Ruff! Ruff!");
    }

    void nameDog(String name){
        this.name = name;
    }

    void setBreed(String breed){
        this.breed = breed;
    }


}
