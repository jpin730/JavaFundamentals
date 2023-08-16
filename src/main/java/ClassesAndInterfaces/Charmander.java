package ClassesAndInterfaces;

public class Charmander extends Pokemon implements IFire {

    public Charmander() {
    }

    @Override
    protected void scratch() {
        System.out.println("scratch");
    }

    @Override
    public void ember() {
        System.out.println("ember");
    }
}
