import java.util.Scanner;
class fibbonaci{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the number you want to check");
        int m=sc.nextInt();
        int count=0;
        int rem;
        while(n!=0){
            rem=n%10;
            if(rem==m){
                count++;
            }
            n/=10;
        }
        System.out.println("The given number is present"+" "+count+" "+"times in the original number");
    }
}