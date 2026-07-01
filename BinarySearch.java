import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int index = Arrays.binarySearch(arr, 40);

        System.out.println("Index = " + index);
    }
}