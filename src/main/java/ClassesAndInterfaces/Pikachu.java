package ClassesAndInterfaces;

public class Pikachu extends Pokemon implements IElectric {

    public Pikachu() {
    }

    @Override
    protected void scratch() {
        System.out.println("scratch");
    }

    @Override
    public void thunderShock() {
        System.out.println("thunderShock");
    }
}
