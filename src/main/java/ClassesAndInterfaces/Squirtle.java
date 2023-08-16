package ClassesAndInterfaces;

public class Squirtle extends Pokemon implements IWater {

    public Squirtle() {
    }

    @Override
    protected void scratch() {
        System.out.println("scratch");
    }

    @Override
    public void bubble() {
        System.out.println("bubble");
    }
}
