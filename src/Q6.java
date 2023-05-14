import java.util.Arrays;

public class Q6 {
    public static void MissingValues(int[] arr, int size) {
        Arrays.sort(arr);
        int value = arr[0];
        int i = 0;
        while (i < size) {
            if (value == arr[i]) {
                value += 1;
                i += 1;
            } else {
                System.out.println(value);
                value += 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        MissingValues(first, first.length);
    }

}
