package interfaceExample;

public class Main {
    public static void main(String[] args) {
        Ogre ogre = new Ogre();
        Bird bird = new Bird();
        Slime slime = new Slime();

        Spawnable[] spawnable = new Spawnable[3];

        spawnable[0] = ogre;
        spawnable[1] = bird;
        spawnable[2] = slime;

        for(Spawnable enemy : spawnable){
            enemy.spawn();
        }
    }
}
