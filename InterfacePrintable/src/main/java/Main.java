import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");

        Magazine magazine1 = new Magazine("Magazine1");
        Magazine magazine2 = new Magazine("Magazine2");

        List<Printable> library = new ArrayList<>();
        library.add(book1);
        library.add(book2);
        library.add(magazine1);
        library.add(magazine2);

        for (Printable items : library) {
            items.print();
        }

        Magazine.printMagazines(library);
        Book.printBooks(library);
        }
    }
