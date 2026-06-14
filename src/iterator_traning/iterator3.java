package iterator_traning;

import java.util.*;

/// ////////Удалить повторяющиеся элементы, оставив только первое вхождение.
public class iterator3 {
    static void main() {
        List<String> names = new ArrayList<>(
                List.of(
                        "Иван",
                        "Петр",
                        "Иван",
                        "Анна",
                        "Петр",
                        "Мария"
                )
        );
        Set <String> set = new HashSet<>();
        Iterator <String> iterator = names.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if (set.contains(word)){
              iterator.remove();   ///names.remove(word) будет ошибкой, удалять нужно именно через итератор
            } else {
                set.add(word);
            }
        }
        System.out.println(names);
    }
}
