public class Q12 {
    public static void main(String[] args) {
        int[] X = {1, 2, 3, 4, 5};
        int[] Y = {2, 3, 4, 5, 6};
        int value = 9;
        System.out.println(findPair(X, Y, value));
    }

    private static boolean findPair(int[] x, int[] y, int value) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length ; j++) {
                if (x[i] + y[j] == value) {
                    System.out.println(x[i] + " " + y[j]);
                    return true;
                }
            }
        }
        return false;
    }

}
