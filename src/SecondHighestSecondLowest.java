import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSecondLowest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,1,2,6,4,3,5,6);

        //Second lowest
        numbers.stream()
                .distinct()
                .sorted()
                .limit(2)
                .skip(1)
                .forEach(System.out::println);

        //Second highest
        numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .forEach(System.out::println);


    }
}
