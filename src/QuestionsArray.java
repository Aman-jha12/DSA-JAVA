import java.util.Scanner;
import java.util.Arrays;


public class QuestionsArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Now Enter the elements of your array :");
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+"th element");
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap( arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int []arr,int index1,int index2){
      int temp=arr[index1];
      arr[index1]=arr[index2];
      arr[index2]=temp;
    }
}
