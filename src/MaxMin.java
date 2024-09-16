import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 22, 222, 123, 43, 243, 78, 21);

        Integer max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        Integer min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
    }
}
