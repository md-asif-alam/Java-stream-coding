import java.util.List;
import java.util.Optional;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        int sum = numbers.stream().reduce((a, b) -> a + b).get();
        Integer sum = numbers.stream().reduce(Integer::sum).get();
        System.out.println(sum);
    }
}
