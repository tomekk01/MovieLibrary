import helpers.Menu;
import helpers.UserInputHandler;
import models.MovieLibrary;

import java.util.Scanner;

import static models.MenuOptions.*;

public class MovieLibraryApp {
    public static void main(String[] args) {

        MovieLibrary.fillMovieList();

        Menu.welcomeMessage();
        while(true) {
            Menu.printMenuOptions();



            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAYINFORMATIONABOUTRANDOMMOVIE:
                    System.out.println("Informacje o wylosowanym filmie: ");
                    MovieLibrary.getRandomMovieInformation();
                    break;
                case DISPLAYACTORSFROMMOVIE:
                    MovieLibrary.printActorFilmography();
                    // TODO Pobranie nazwiska aktora od uzytkownika
                    // TODO Metoda filtrujaca
                    break;
                case EXITAPPLICATION:
                    System.out.println("Zamykanie aplikacji...");
                    System.exit(1);
                default:
                    // TODO - do napisania pozniej
                    System.out.println("Bledny wybor");
            }
        }
    }
}