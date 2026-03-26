package DSA.IfElse;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element To Check It Is Integer : ");
        double n = sc.nextDouble();
        if(n==(int)n)
            System.out.println("The Given Number Is Integer");
        else
            System.out.println("The Given Number Is Not An Integer");
        sc.close();
    }
}
