import java.util.Arrays;

public class Q9 {
    public static void SumDistinct(int[] arr, int size) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < (size - 1); i++) {
            if (arr[i] != arr[i + 1])
                sum += arr[i];
        }
        sum += arr[size - 1];
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 6,3,3,5,6,3,2,4, 7, 8, 9, 10 };
        SumDistinct(first, first.length);
    }
}
