import java.util.ArrayList;
import java.util.List;

public class Zadacha3 {
    static void main() {
        List<String> names = new ArrayList<>(List.of(
                "Иван",
                "Петр",
                "Евгений",
                "Ярослав",
                "Александр"));
        System.out.println(names);
        int dellIndex =3;
        String dellValue = "Евгений";
         names.removeIf(name-> name.equals(dellValue));
        System.out.println(names);

        names.remove(dellIndex);
        System.out.println(names);

    }
}
