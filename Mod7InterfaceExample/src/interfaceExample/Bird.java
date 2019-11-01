package interfaceExample;

public class Bird implements Spawnable {
    private String name = "Bird";


    @Override
    public void spawn() {
        System.out.println(name);
    }
}