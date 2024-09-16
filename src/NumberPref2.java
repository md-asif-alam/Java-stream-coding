import java.util.Arrays;
import java.util.List;

public class NumberPref2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 22, 222, 123, 43, 243, 78, 21);
        numbers.stream()
                .map(num->String.valueOf(num))
                .filter(num->num.startsWith("2"))
                .mapToInt(num-> Integer.parseInt(num))
                .forEach(System.out::println);
    }
}
