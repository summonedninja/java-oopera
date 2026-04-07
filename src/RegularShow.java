public class RegularShow extends Show {
    public RegularShow(String title, int duration, Director director) {
        super(title, duration, director);
    }

    @Override
    public String toString() {
        return "RegularShow{" +
                "Участники " + getListOfActors() +
                "}";
    }
}
