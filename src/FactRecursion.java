import java.util.Scanner;
class FactRecursion{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();

        System.out.println("The factorial of the inoutted Number is :"+fact(n));
    }
    static int fact(int n){
        if(n==0||n==1){
            return n;
        }
        return((n%10)*10)+fact(n/10);
    }
}