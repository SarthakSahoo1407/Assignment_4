public class Q18 {
    //Suppose you are given an unsorted list of n distinct elements. How will you identify the second largest element with minimum number of comparisons?
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0], secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second largest element is: " + secondMax);
    }
}
