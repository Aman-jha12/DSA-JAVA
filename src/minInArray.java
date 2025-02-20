import java.util.Scanner;
class minInArray{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Now enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minArray=min(arr);
        System.out.println("The minimum in the given array is:" + minArray);
    }
    static int min(int [] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}