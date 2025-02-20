import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=input.nextInt();
        if(!isprime(n)){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }
    }
    static boolean isprime(int n){
        if(n<=1) return false;
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
