import java.util.List;

class Book implements Printable {
    private String bookName;

    public String getBookName() {
        return bookName;
    }
    public Book(String name) {
        this.bookName=name;
    }
    @Override
    public void print() {
        System.out.println("Book");
    }

    public static void printBooks(List<Printable> library){
        for (Printable item : library) {
            if (item instanceof Book) {
                System.out.println("Just books: "+((Book)item).getBookName());
            }
        }
    }
}
