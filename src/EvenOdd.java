import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().filter(num->num%2==0).forEach(System.out::println);
        System.out.println("--------------------------------------------");
        numbers.stream().filter(num->num%2!=0).forEach(System.out::println);

    }
}
