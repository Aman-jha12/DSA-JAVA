import java.util.Scanner;




public class countDistinctNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int [] arr=new int[]{1,2,2,1,3};
        System.out.println(DistinctElement(arr));
    }



    public static int DistinctElement(int [] arr){
        int Distinct=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=arr[i+1])
                Distinct=arr[i];
        }
        return Distinct;
    }
}
