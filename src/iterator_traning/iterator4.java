package iterator_traning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator4 {
    static void main() {
/////        Задача 4. Удалить элементы по условию + зависимость от предыдущего
/////        Нужно пройти по списку и:
/////       1. Удалить все числа, которые:
/////       меньше 5
/////       или делятся на 2


        List<Integer> numbers = new ArrayList<>(List.of(
                3, 8, 2, 7, 6, 5, 10, 1, 4
        ));
        Iterator <Integer> iterator = numbers.iterator();
        System.out.println(numbers);
        while (iterator.hasNext()){
            Integer n = iterator.next();
            if (n<5||n%2==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}
