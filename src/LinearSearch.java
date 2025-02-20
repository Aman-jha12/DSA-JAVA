import java.util.Scanner;
public class LinearSearch {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Now enter the elements of the array");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " th element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to search for");
        int m = sc.nextInt();
        if (linear(arr, m)) {
            System.out.println("Element found!");
        } else {
            System.out.println("Element not found");
        }
    }
        static boolean linear(int[] arr, int key){
            for (int j : arr) {
                if (j == key)
                    return true;
            }
                    return false;
        }
}
