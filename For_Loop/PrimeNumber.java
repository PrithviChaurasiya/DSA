package DSA.For_Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To Check The Number is Prime or Not : ");
        int n = sc.nextInt();
        boolean Prime=true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
            {
                Prime=false;
                break;
            }
        }
        if (n==1)
            System.out.println("Neither Prime Number Nor Composite Number");
        else if(Prime)
            System.out.println("Prime Number");
        else
            System.out.println("Composite Number");
        sc.close();
    }
}
