public class Q1 {
    public static int FirstRepeated(int[] arr, int size) {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] first = { 34, 56, 77, 1, 5, 6, 6, 6, 7, 8, 10, 34, 20, 30 };
        System.out.println(FirstRepeated(first, first.length));
    }

}
