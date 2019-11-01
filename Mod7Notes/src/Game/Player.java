package Game;

public class Player extends GameObject {
    @Override // called a decorator. It makes sure the compiler understands it's am overriding function
    public void display() { // getting display from GameObject
        System.out.println("this is the player");
    }
}
