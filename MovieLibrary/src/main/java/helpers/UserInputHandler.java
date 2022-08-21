package helpers;

import models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scan = new Scanner(System.in);

    public static MenuOptions getMenuOptionFromUser(){
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];


    }
//Rekursywne wywołanie metody do skutku
    private static int getSelectedOptionFromUser(){
        int result = getIntegerFromUser();
        scan.nextLine();
        if (result > 0 && result<MenuOptions.values().length + 1)
        {
        return result;
        }
        else
        {
            System.out.println("Wybrałeś niestniejącą opcję " + result);
            System.out.println("Spróbuj jeszcze raz");
            return getSelectedOptionFromUser();
        }
    }

    private static int getIntegerFromUser() {
        while (!scan.hasNextInt()) {
            scan.nextLine();
            System.out.println("To nie jest integer. Spróbuj ponownie!");
        }
        return scan.nextInt();
    }
}
