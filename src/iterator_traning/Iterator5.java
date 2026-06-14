package iterator_traning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Удаление + подсчёт статистики одновременно
//Во время обхода:
//Удалить все отрицательные числа
//Посчитать:
//количество удалённых элементов
//сумму оставшихся элементов
public class Iterator5 {
    static void main() {
        List<Integer> numbers = new ArrayList<>(List.of(
                5, 2, 8, -3, 7, 0, -1, 4, 9, -6
        ));
        int removedElements=0;
        int sumRemainingElements=0;
        Iterator <Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            if (n<0){
                it.remove();
                removedElements++;
            } else {
                sumRemainingElements = sumRemainingElements+n;
            }


        }
        System.out.println(sumRemainingElements);
        System.out.println(removedElements);



    }
}
