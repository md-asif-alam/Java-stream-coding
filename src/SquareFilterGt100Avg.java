import java.util.Arrays;
import java.util.List;

public class SquareFilterGt100Avg {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = numbers.stream()
                .map(num -> num * num)
                .filter(num -> num > 9)
                .mapToInt(num -> num)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
