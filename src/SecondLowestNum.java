import java.util.Arrays;

public class SecondLowestNum {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,1,5,8,6,7};
        secondLowestElem(arr);
    }
    public static void secondLowestElem(int[] arr){
        int secLowest = Arrays.stream(arr).distinct().sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array doesn't have a second smallest element"));
        System.out.println("Second lowest Element:"+secLowest);
    }
}
