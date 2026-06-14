import java.util.ArrayList;
import java.util.List;

public class Zadacha2 {
    static void main() {
        List<String> names = new ArrayList<>(List.of(
                "Иван",
                "Петр",
                "Евгений",
                "Ярослав",
                "Александр"));
        String found = "";
        String searchingName = "аЛекСанДр1";

        for (String i : names) {
            if (i.equalsIgnoreCase(searchingName)) {
                found = i;
                break;
            }
        }

        if (found.isEmpty()) {
            System.out.println("имя не найдено");
        } else {
            System.out.println(names.indexOf(found));
        }
    }
}