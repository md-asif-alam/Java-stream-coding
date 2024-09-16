import java.util.Arrays;
import java.util.List;

public class GetFirstFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 22, 222, 123, 43, 243, 78, 21);

        numbers.stream().limit(5).forEach(System.out::println);
        System.out.println("---------------------------------");
        int sum = numbers.stream().limit(5).mapToInt(num -> num).sum();
        System.out.println(sum);
        System.out.println("---------------------------------");

        numbers.stream().skip(4).forEach(System.out::println);


    }
}
