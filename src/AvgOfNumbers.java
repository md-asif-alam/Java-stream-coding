import java.util.Arrays;
import java.util.List;

public class AvgOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//        int sum = numbers.stream().mapToInt(e -> e).sum();
        double average = numbers.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println(average);
    }
}
