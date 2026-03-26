package DSA.IfElse;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.println((n%2==0) ? "Even" : "Odd");

        // Greatest anmong 3 number

        int a=3,b=5,c=2;
        System.out.println((a>b?(a>c? a:c):(b>c?b:c)  ));
    }
}
