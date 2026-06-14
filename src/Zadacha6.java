import java.util.ArrayList;
import java.util.List;

public class Zadacha6 {
    static void main() {
        List <Integer> list = new ArrayList<>(List.of(1,2,-3,4,5,6,7,8,9,10,9));
                list.removeIf(n->n%2==0);
        System.out.println(list);
    }
}
