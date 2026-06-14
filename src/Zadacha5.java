import java.util.ArrayList;
import java.util.List;

public class Zadacha5 {
    static void main() {
        List<Integer> list = new ArrayList<>(List.of(1,2,-3,4,5,6,7,8,9,10,9));
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (Integer i:list){
            if (min>i){
                min=i;
            }
            if (max<i){
                max=i;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
