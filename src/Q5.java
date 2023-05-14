public class Q5 {
    public static int findMissingNumber2(int[] arr, int size, int range) {
        int i;
        int xorSum = 0;
// get the XOR of all the numbers from 1 to range
        for (i = 1; i <= range; i++) {
            xorSum ^= i;
        }
// loop through the array and get the XOR of elements
        for (i = 0; i < size; i++) {
            xorSum ^= arr[i];
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int[] first = { 1,2,3,4,6,7,8,9,10 };
        System.out.println(findMissingNumber2(first, first.length, 10));
    }
}
