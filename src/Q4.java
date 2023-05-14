import java.util.Arrays;

public class Q4 {
    public static int[] removeDuplicates(int[] array, int size) {
        int j = 0;
        int i;
        Arrays.sort(array);
        for (i = 1; i < size; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }
        int[] ret = Arrays.copyOf(array, j + 1);
        return ret;
    }

    public static void main(String[] args) {
        int[] first = { 34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
        int[] second = removeDuplicates(first, first.length);
        System.out.println(Arrays.toString(second));
    }
}
