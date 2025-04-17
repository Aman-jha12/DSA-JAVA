import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
//        if(binarySearch(arr,5)){
//            System.out.print("Target Found");
//        }
//else{
//    System.out.print("Target not found");
//        }
        int retIndexNum = retIndex(arr, 9);
        if (retIndexNum != -1) {
            System.out.print("Target Found at index " +retIndexNum);
        } else {
            System.out.print("Target not found");
        }

    }


    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return true;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return false;
    }

    //return the index if found
    public static int retIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }
return -1;
    }
}
