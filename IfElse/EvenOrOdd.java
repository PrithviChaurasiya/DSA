package DSA.IfElse;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element To Check It Is Even Or Odd : ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("The Given Number Is Even");
        else 
            System.out.println("The Given Number Is Odd");
        sc.close();
    }
}
