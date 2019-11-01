package interfaceExample;

public class Ogre implements Spawnable,Walkable {
    private String name = "Ogre";


    @Override
    public void spawn() {
        System.out.println(name);
    }

    @Override
    public void walk() {
        System.out.println("Ogre is walking");
    }
}
