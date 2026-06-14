package iterator_traning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/// /Необходимо удалить все чётные числа, используя только Iterator.
public class iterator1 {
    static void main() {
        List<Integer> numbers = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 7, 8));

        Iterator <Integer> it = numbers.iterator();

        while (it.hasNext()){
            Integer n =  it.next();
            if (n%2==0){
                it.remove();
            }

        }
        System.out.println(numbers);
    }




}
