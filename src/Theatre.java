import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Theatre {
    public static List<Actor> actors = new ArrayList<Actor>();

    public static void main(String[] args) {

        Actor actorOne = new Actor("AName1", "Surname1", Gender.MALE, 111);
        Actor actorTwo = new Actor("AName2", "Surname2", Gender.FEMALE, 222);
        Actor actorThree = new Actor("AName3", "Surname3", Gender.MALE, 333);

        Director director1 = new Director("DName1", "DSurname1", Gender.MALE, 2);
        Director director2 = new Director("DName2", "DSurname2", Gender.MALE, 1);

        MusicAuthor musicAuthor = new MusicAuthor("MName1", "MSurname1", Gender.FEMALE);
        Choreographer choreographer = new Choreographer("CName2", "CSurname2", Gender.MALE);


        RegularShow regularShow = new RegularShow("Обычное шоу", Duration.ofMinutes(120), director1);
        Opera opera = new Opera("Опера", Duration.ofMinutes(180), director2,
                musicAuthor, "Some text", 20);
        Ballet ballet = new Ballet("Балет", Duration.ofMinutes(180), director2,
                musicAuthor, "SomeLibrettoText2", choreographer);

        regularShow.addActor(actorOne);
        ballet.addActor(actorThree);
        ballet.addActor(actorTwo);
        opera.addActor(actorOne);
        opera.addActor(actorThree);
        regularShow.addActor(actorThree);

        System.out.println("Список актёров Regular Show\n");
        regularShow.printActors();

        System.out.println("\nСписок актёров Ballet\n");
        ballet.printActors();

        System.out.println("\nСписок актёров Opera\n");
        opera.printActors();

        System.out.println("\nЗамена Актёров!!!\n");

        opera.replaceActor(actorOne,actorTwo);
        opera.printActors();

        System.out.println("\nЗамена Актёров!!!\n");
        regularShow.replaceActor(actorTwo,actorThree);

        System.out.println("Либретто текст");
        System.out.println("\nОпера: " + opera.getLibrettoText());
        System.out.println("\nБалет: " + ballet.getLibrettoText());






    }
}
