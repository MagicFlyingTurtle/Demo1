import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("qwe");
        set1.add("wer");
        set1.add("ert");
        set2.add("qwe");
        set2.add("wer");
        set2.add("asd");

        System.out.println(UnionIntersect.unionSet(set1, set2));
        System.out.println(UnionIntersect.intersect(set1, set2));

        String login = "374635";
        String password = "gfh1";
        String confirmPassword = "gfh";
        Verification verification = new Verification();
        verification.verificationLoginAndParol(login, password, confirmPassword);
    }
}
