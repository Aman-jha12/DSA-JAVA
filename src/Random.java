import java.util.Scanner;
class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int Number = sc.nextInt();
        int count=0;
        if (Number == 1) {
            System.out.println("It is ");
        }

        int factorial = 1, i = 1;
        while (factorial < Number) {
            i++;
            factorial *= i;
            if (factorial == Number)
                count++;
        }

        if (count == 0)
            System.out.println("It is not");
        else {
            System.out.println("It is");
        }
    }
}

