package Game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Menu menu = new Menu();

        player.display();
        menu.display();

        // Could also be instantiated as...
        // This is particularly useful because now they are all of the same type
        // which means you could put all of the GameObjects in an array and sort them.

        GameObject player1 = new Player();
        GameObject menu1 = new Menu();

        player1.display();
        menu1.display();

        GameObject[] gameObjects = new GameObject[4];
        gameObjects[0] = player1;
        gameObjects[1] = menu1;

        // Okay, actually this is pointless becausd Player and Menu EXTEND GameObject, so you
        // could put those types in an array too.

        gameObjects[2] = player;
        gameObjects[3] = menu;

        for (GameObject object : gameObjects){
            object.display();
        }

        // Use of concrete functions
        player.displayObject();
        menu.displayObject();
    }
}
