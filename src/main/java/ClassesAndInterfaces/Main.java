package ClassesAndInterfaces;

public class Main {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        System.out.println("\nSQUIRTLE");
        squirtle.scratch();
        squirtle.bubble();

        System.out.println("\nCHARMANDER");
        charmander.scratch();
        charmander.ember();

        System.out.println("\nBULBASAUR");
        bulbasaur.scratch();
        bulbasaur.vineWhip();

        System.out.println("\nPIKACHU");
        pikachu.scratch();
        pikachu.thunderShock();

    }
}
