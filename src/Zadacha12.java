import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zadacha12 {
    static void main() {
        //////Посчитай частоту встречаемости каждого слова в ArrayList<String> с помощью HashMap<String, Integer>.
        List<String> names = new ArrayList<>(List.of(
                "Иван",
                "Иван",
                "Иван",
                "Петр",
                "Евгений",
                "Евгений",
                "Ярослав",
                "Александр"));
        Map<String, Integer> map = new HashMap<>();
//for (String i: names){
//    map.merge(i, 1, (a,b)->a+b);
//}

        for (String i:names){
            if (!map.containsKey(i)){
                map.put(i,1);

            } else {
                map.put(i, map.get(i)+1);
            }
        }
        System.out.println(map);
        }
}
