import java.util.ArrayList;
import java.util.List;

public class Zadacha10 {
    static void main() {
        /////10Дан ArrayList<String>. Преобразуй все строки в верхний регистр и отфильтруй те, что короче 3 символов.
        List<String> list = new ArrayList<>(List.of("кошка", "собака", "кот", "три"));
        List<String> result = new ArrayList<>();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() >= 3) {
                result.add(list.get(i).toUpperCase());
            }
        }
        System.out.println(list);
        System.out.println(result);
    }
}
