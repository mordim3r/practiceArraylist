import java.util.ArrayList;
import java.util.List;

public class Zadacha9 {
    static void main() {
       /// 9Дан ArrayList<String> со словами. Найди самое длинное и самое короткое слово.
        List<String> names = new ArrayList<>(List.of(
                "Иван",
                "Петр",
                "Евгений",
                "Ярослав",
                "Александр"));
        Integer maxLengthWord =Integer.MIN_VALUE;
        Integer minLengthWord=Integer.MAX_VALUE;
        String StringMaxLenghtWord="";
        String StringMinLenghtWord="";

        System.out.println(names);
        for (String i :names){
            if (maxLengthWord<i.length()) {
                maxLengthWord = i.length();
                StringMaxLenghtWord = i;
            }
            if (minLengthWord>i.length()){
                minLengthWord=i.length();
                StringMinLenghtWord=i;
            }



        }
        System.out.println(StringMaxLenghtWord+" содержит "+ maxLengthWord+" букв");
        System.out.println(StringMinLenghtWord+" содержит "+ minLengthWord+" букв");


    }
}
