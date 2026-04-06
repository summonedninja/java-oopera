import java.time.Duration;
import java.util.List;

public class RegularShow extends Show {
    public RegularShow(String title, Duration duration, Director director) {
        super(title, duration, director);
    }

    @Override
    public String toString() {
        return "RegularShow{" +
                "Участники " + getListOfActors() +
                "}";
    }
}
