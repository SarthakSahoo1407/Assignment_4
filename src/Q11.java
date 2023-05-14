import java.util.Arrays;

public class Q11 {
    public static boolean FindPair2(int[] arr, int size, int value) {
        int first = 0, second = size - 1;
        int curr;
        Arrays.sort(arr);
        while (first < second) {
            curr = arr[first] + arr[second];
            if (curr == value) {
                System.out.println("Pair is " + arr[first] + "," + arr[second]);
                return true;
            } else if (curr < value) {
                first++;
            } else {
                second--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        FindPair2(first, first.length, 8);
    }
}
