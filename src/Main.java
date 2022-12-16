import models.Book;
import models.Reader;

public class Main {
    public static void main(String[] args) {

        Book hp = new Book("harry potter", "j.rouling");
        Book interstellar = new Book("interstellar", "kip thorn");
        Book holms = new Book("sherloc holms", "artur conan doyle");

        Reader student = new Reader("David Beckham", 1233, "information technology","04.04.1992");
        student.takeBook(3);
        student.takeBook(new Book[]{hp,interstellar, holms});

        student.returnBook(new Book[]{holms, hp});
        student.returnBook(2);

    }
}