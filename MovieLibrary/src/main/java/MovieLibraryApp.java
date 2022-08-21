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
                    System.out.println("Film wg aktora");
                    // TODO - do napisania pozniej
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