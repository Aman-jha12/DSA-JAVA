import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= input.nextInt();
        if(isArmStrong(n)){
            System.out.print("Armstrong ");
        }
        else
            System.out.println("Not a armstrong");
//        for(int i=100;i<=999;i++){
//            if(isArmStrong(i)){
//                System.out.print(i+" ");
//            }
//        }
    }
    static boolean isArmStrong(int n){
        int original=n;
        int sum=0;
        while(n!=0){
            int a=n%10;
            sum+=a*a*a;
            n/=10;
        }
      return sum==original;
    }
}
