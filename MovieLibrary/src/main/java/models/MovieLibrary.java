package models;

import helpers.RandomDataProvider;
import helpers.UserInputHandler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieLibrary {
    private static List<Movie> moviesLibrary;

    public static void fillMovieList(){

        moviesLibrary = new LinkedList<>();
        Director RScott = new Director("Ridley", "Scott");
        Director g_Verbinski = new Director("Gore","Verbinski");
        Director q_Tarantino = new Director("Quentin","Tarantino");
        Director p_Jackson = new Director("Peter","Jackson");

        Actor r_Crowe = new Actor("Russel", "Crowe");
        Actor o_Reed = new Actor("Oliver", "Reed");
        Actor d_Jacob = new Actor("Derek", "Jacob");
        Actor j_Deep = new Actor("Johnny", "Deep");
        Actor o_Bloom = new Actor("Orlando", "Bloom");
        Actor k_Knightley = new Actor("Keira", "Knightley");
        Actor j_Travolta = new Actor("John", "Travolta");
        Actor u_Thurman = new Actor("Uma", "Thurman");
        Actor h_Keitel = new Actor("Harvey", "Keitel");
        Actor t_Cruze = new Actor("Tom", "Cruise");

        moviesLibrary.add(new Movie("Gladiator",RScott, List.of(r_Crowe,o_Reed)));
        moviesLibrary.add(new Movie("Pirates of the Caribbean",g_Verbinski, List.of(o_Reed, j_Deep)));
        moviesLibrary.add(new Movie("Pulp Fiction",q_Tarantino, List.of(j_Travolta, u_Thurman)));
        moviesLibrary.add(new Movie("Hobbit - An Unexpected Jorney",RScott, List.of(k_Knightley, d_Jacob)));
        moviesLibrary.add(new Movie("Poranek Kojota",p_Jackson, List.of(r_Crowe, o_Bloom)));
        moviesLibrary.add(new Movie("Transformers",q_Tarantino, List.of(r_Crowe, d_Jacob)));
        moviesLibrary.add(new Movie("Top Gun",RScott, List.of(r_Crowe, t_Cruze)));
        moviesLibrary.add(new Movie("Desperado",RScott, List.of(r_Crowe, o_Bloom)));
        moviesLibrary.add(new Movie("Mission Impossible",p_Jackson, List.of(r_Crowe, t_Cruze)));
        moviesLibrary.add(new Movie("Forest Gump",g_Verbinski, List.of(o_Reed, h_Keitel)));


    }

    public static List<Movie> getMoviesLibrary() {
        return moviesLibrary;
    }

    public static void getRandomMovieInformation(){

        System.out.println(moviesLibrary.get(RandomDataProvider.getRandomMovieIndex()));

    }

    public static void printActorFilmography(){

        Actor actor = UserInputHandler.getActorFromUser();
        List<String> actorFilmographyList = getActorFilmographyList(actor);
        if (actorFilmographyList.isEmpty()){
            System.out.println("Nie mamy filmu z Twoim aktorem");
        }
        else {
            System.out.println("Aktor " + actor + " grał w następujących filmach: ");
            for (String s : actorFilmographyList) {
                System.out.println(s + "\n ");
            }
        }
    }

    private static List<String> getActorFilmographyList(Actor actorToFind) {
        Predicate<Movie> movieCheck = movie -> movie.getListofActors().stream()
                .anyMatch(actor -> actor.getFirstName().equals(actorToFind.getFirstName()) &&
                        actor.getLastName().equals(actorToFind.getLastName()));

        return moviesLibrary.stream()
                .filter(movieCheck)
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }
}
