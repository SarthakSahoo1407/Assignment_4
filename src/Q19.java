import java.util.Arrays;

public class Q19 {
    public static int getMedian(int[] arr, int size) {
        Arrays.sort(arr);
        return arr[size / 2];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int median = getMedian(arr, arr.length);
        System.out.println("Median is: " + median);
    }
}
