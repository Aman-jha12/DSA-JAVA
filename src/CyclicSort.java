import java.util.Scanner;
import java.util.Arrays;

class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 3, 4};

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        sort(arr);  // Call the sorting function
        System.out.println("After Sorting: " + Arrays.toString(arr));

        sc.close();  // Close Scanner
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;  // Correct index calculation
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
