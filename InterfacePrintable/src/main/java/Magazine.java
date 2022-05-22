import java.util.List;

public class Magazine implements Printable {

    private String magazineName;

    public String getMagazineName() {
        return magazineName;
    }
    public Magazine(String name) {
        this.magazineName=name;
    }
    @Override
    public void print() {
        System.out.println("Magazine");
    }
    public static void printMagazines(List<Printable> library){
        for (Printable item : library) {
            if (item instanceof Magazine) {
                System.out.println("Just magazines: "+((Magazine)item).getMagazineName());
            }
        }
    }
}
