import java.util.HashSet;

public class Q2 {
    public static void printRepeating3(int[] arr, int size) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int i;
        System.out.print("Repeating elements are: ");
        for (i = 0; i < size; i++) {
            if (hs.contains(arr[i])) {
                System.out.print( arr[i]+" ");
            } else {
                hs.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] first = { 34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
        printRepeating3(first, first.length);
    }
}
