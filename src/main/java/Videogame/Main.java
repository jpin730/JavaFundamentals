package Videogame;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Videogame> videogameList = new ArrayList<>();

        Videogame videogame1 = new Videogame(1, "Banjo Kazooie", "Nintendo 64", 4, "Platform");
        Videogame videogame2 = new Videogame(1, "Mario Party", "Nintendo 64", 4, "Casual");
        Videogame videogame3 = new Videogame(1, "Age of Empire", "PC", 1, "Strategy");
        Videogame videogame4 = new Videogame(1, "Counter Strike", "PC", 4, "Shooter");
        Videogame videogame5 = new Videogame(1, "Gran Turismo", "PlayStation II", 1, "Racing");

        videogameList.add(videogame1);
        videogameList.add(videogame2);
        videogameList.add(videogame3);
        videogameList.add(videogame4);
        videogameList.add(videogame5);

        for (Videogame videogame : videogameList) {
            System.out.println("\n" + videogame.getTitle().toUpperCase());
            System.out.println("Console: " + videogame.getConsole());
            System.out.println("Category: " + videogame.getCategory());
            System.out.println("Players: " + videogame.getPlayers());
        }

        System.out.println("\nVideogames with console is Nintendo 64");
        for (Videogame videogame : videogameList) {
            if (videogame.getConsole().equals("Nintendo 64")) {
                System.out.println(videogame.toString());
            }
        }

    }
}
