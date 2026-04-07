import java.util.ArrayList;
import java.util.List;

public abstract class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> actors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return actors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.actors = listOfActors;
    }

    public void printActors() {
        if (actors == null || actors.isEmpty()) {
            System.out.println("No actors in this show");
            return;
        }
        System.out.println("Actors in show \"" + getTitle() + "\":");
        actors.forEach(System.out::println);
    }

    public boolean addActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println(actor + " is already in the show.");
            return false;
        }
        actors.add(actor);
        System.out.println(actor + " added to the show.");
        return true;
    }

    public boolean replaceActor(Actor oldActor, Actor newActor) {
        int index = actors.indexOf(oldActor);
        if (index != -1) {
            if (actors.contains(newActor)) {
                System.out.println(newActor + " is already in the show.");
                return false;
            }
            actors.set(index, newActor);
            System.out.println("Replaced " + oldActor + " with " + newActor);
            return true;
        } else {
            System.out.println(oldActor + " not found in the show.");
            return false;
        }
    }
}



