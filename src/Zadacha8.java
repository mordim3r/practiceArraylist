import java.util.ArrayList;
import java.util.List;

public class Zadacha8 {
    static void main() {
       ////Дан ArrayList<Integer>. Раздели его на два списка: чётные и нечётные числа.
        List<Integer> list = new ArrayList<>(List.of(1,2,-3,4,5,6,7,8,9,10,9));

        List<Integer>even =new ArrayList<>();
        List<Integer>odd =new ArrayList<>();
        for (Integer i: list){
            if (i%2==0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        System.out.println(list);
        System.out.println(even);
        System.out.println(odd);
    }
}
