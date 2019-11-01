package interfaceExample;

public class Slime implements Spawnable {
    private String name = "Slime";


    @Override
    public void spawn() {
        System.out.println(name);
    }
}
