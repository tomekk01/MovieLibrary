import helpers.Menu;

import java.util.Scanner;

public class MovieLibraryApp {
    public static void main(String[] args) {

        Menu.welcomeMessage();
        while(true) {
            Menu.printMenuOptions();

            Scanner scan = new Scanner(System.in);
            int tempd = scan.nextInt();

            switch (tempd) {
                case 1:
                    System.out.println("Losowy film");
                    // TODO - do napisania pozniej
                    break;
                case 2:
                    System.out.println("Film wg aktora");
                    // TODO - do napisania pozniej
                    break;
                case 3:
                    System.out.println("Zamykanie aplikacji...");
                    System.exit(1);
                default:
                    // TODO - do napisania pozniej
                    System.out.println("Bledny wybor");
            }
        }
    }
}