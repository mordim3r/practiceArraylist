import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadacha11 {
    /// //Удали дубликаты из ArrayList<String>, сохранив порядок появления
    /// //(сначала вручную, потом через LinkedHashSet — сравни подходы).
    static void main() {
        List<String> names = new ArrayList<>(List.of(
                "Иван",
                "Иван",
                "Иван",
                "Петр",
                "Евгений",
                "Евгений",
                "Ярослав",
                "Александр"));
        List<String> list = new ArrayList<>();
        for (String i : names) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
