import java.util.Scanner;

public class maxInArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Now enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxArray=max(arr);
        System.out.println("The maximum in the given array is:" + maxArray);
    }

    public static int max(int [] arr){
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    }

