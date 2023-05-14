import java.util.Arrays;

public class Q13 {
    public static int findMinDiff(int[] arr, int size) {
        Arrays.sort(arr);
        int diff = 9999999;
        for (int i = 0; i < (size - 1); i++) {
            if ((arr[i + 1] - arr[i]) < diff)
                diff = arr[i + 1] - arr[i];
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 12, 18, 25};
        int size = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, size));
    }
}
