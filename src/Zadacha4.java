import java.util.ArrayList;
import java.util.List;

public class Zadacha4 {
    static void main() {
        List <Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        int sum=0;
        double sredn =0;
       double size=numbers.size();
        for (Integer i : numbers){
            sum = sum+i;
        }
        sredn = sum/size;
        System.out.println(sum);
        System.out.println(sredn);

    }
}
