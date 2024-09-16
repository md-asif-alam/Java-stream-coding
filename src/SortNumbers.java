import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 22, 222, 123, 43, 243, 78, 21);

        numbers.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------------------------------");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
