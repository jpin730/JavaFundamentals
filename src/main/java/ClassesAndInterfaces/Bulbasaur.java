package ClassesAndInterfaces;

public class Bulbasaur extends Pokemon implements IGrass {

    public Bulbasaur() {
    }

    @Override
    protected void scratch() {
        System.out.println("scratch");
    }

    @Override
    public void vineWhip() {
        System.out.println("vineWhip");

    }

}
