import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 1, 4, 5, 6, 7, 8, 9);
        list.stream().filter(e-> Collections.frequency(list,e)>1).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------");
        list.stream().filter(e->Collections.frequency(list,e)==1).forEach(System.out::println);
    }
}
