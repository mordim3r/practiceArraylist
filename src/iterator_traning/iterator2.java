package iterator_traning;

import java.util.Iterator;
import java.util.List;

public class iterator2 {
    static void main() {

        ///////Задача 2. Подсчитать количество строк длиннее 5 символов
        int count =0;
        List<String> words = List.of(
                "Java",
                "Iterator",
                "Code",
                "Collection",
                "Map"
        );
/// /////через for each
//        for (String i: words ){
//            if (i.length()>5){
//                count++;
//            }
//        }
//        System.out.println(count);
    /// //////через iterator
        Iterator <String> it = words.iterator();
        while (it.hasNext()){
            String w = it.next();
            if (w.length()>5){
                count++;
            }
        }
        System.out.println(count);
    }
}
