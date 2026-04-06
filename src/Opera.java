import java.time.Duration;
import java.util.List;

public class Opera extends MusicalShow {
    private int choirSize;
    public Opera(String title, Duration duration, Director director,
                 MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Opera{" +
                "choirSize = " + choirSize +
                ", Участники = " + getListOfActors() +
                '}';
    }
}
