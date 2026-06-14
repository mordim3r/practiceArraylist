import java.util.ArrayList;

import java.util.List;

public class Zadacha7 {
    static void main() {
        ////////Реализуй разворот списка "вручную" — обменивая элементы по индексам,
        ////////без Collections.reverse().

        List<String> names = new ArrayList<>(List.of(
                "Иван",
                "Петр",
                "Евгений",
                "Ярослав",
                "Александр"));
        System.out.println(names);


            int left =0;
            int right = names.size()-1;
            while (left<right) {
                String temp = names.get(left);
                names.set(left, names.get(right));
                names.set(right, temp);
                left++;
                right--;
            }
        System.out.println(names);
    }
}
