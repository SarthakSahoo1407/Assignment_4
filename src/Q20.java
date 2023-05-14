public class Q20 {
    public static int SearchBitonicArray(int[] arr, int size, int key) {
        int max = FindMaxBitonicArray(arr, size);
        int k = BinarySearch(arr, 0, max, key, true);
        if (k != -1) {
            return k;
        } else {
            return BinarySearch(arr, max + 1, size - 1, key, false);
        }
    }

    private static int BinarySearch(int[] arr, int i, int max, int key, boolean b) {
        int start = i, end = max, mid;
        if (b == false) {
            start = max;
            end = i;
        }
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                if (b == true) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (b == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static int FindMaxBitonicArray(int[] arr, int size) {
        int start = 0, end = size - 1, mid;
        if (size < 3) {
            System.out.println("error");
            return -1;
        }
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid])// maxima
            {
                return mid;
            } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1])// increasing
            {
                start = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1])// increasing
            {
                end = mid - 1;
            } else {
                break;
            }
        }
        System.out.println("error");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int key = 3;
        int pos = SearchBitonicArray(arr, arr.length, key);
        if (pos != -1) {
            System.out.println("Found " + key + " at " + pos);
        } else {
            System.out.println(key + " not found in the array");
        }
    }
}
