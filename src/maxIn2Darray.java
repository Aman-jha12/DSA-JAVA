import java.util.Arrays;

public class maxIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 4, 5},
                {0, 1, 0}
        };

        int[] maxRow = rowWithMaxSum(arr);
        System.out.println("Row with max sum = " + Arrays.toString(maxRow));
    }

    public static int[] rowWithMaxSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int[] maxRow = {};

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = arr[i]; // Store the whole row
            }
        }

        return maxRow;
    }
}
