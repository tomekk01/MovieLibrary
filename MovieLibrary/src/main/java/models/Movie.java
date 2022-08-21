package models;

import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private List<Actor> listofActors;

    public Movie(String title, Director director, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.listofActors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListofActors() {
        return listofActors;
    }

    public void setListofActors(List<Actor> listofActors) {
        this.listofActors = listofActors;
    }

    private String printActorsInOneLine(){
        var actorsInOneRow = new StringBuilder();
        String separator = "";
        for (Actor listofActor : listofActors) {
            actorsInOneRow.append(separator+listofActor+"");
            separator=", ";
        }
        return actorsInOneRow.toString();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", listofActors=" + printActorsInOneLine();

    }
}
