import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={4,5,6,7,8,1};

        fetchCommonElem(arr1,arr2);
    }

    private static void fetchCommonElem(int[] arr1, int[] arr2) {

        List<Integer> commonElem = Arrays.stream(arr1)
                .filter(number -> Arrays.stream(arr2).anyMatch(arrNumber2 -> arrNumber2 == number))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(commonElem);
    }


}
